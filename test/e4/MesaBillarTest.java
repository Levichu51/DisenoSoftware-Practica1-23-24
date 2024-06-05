package e4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MesaBillarTest {
    //private static final MesaBillar mesa = new MesaBillar();

    @Test
    public void testIniciarPartida() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        assertTrue(mesa.esPartidaIniciada());
    }

    @Test
    public void testMeterBolaBlanca() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BLANCA);
        assertEquals(16, mesa.bolaMesa().size());
        assertEquals(0, mesa.bolasCaja().size());
    }

    @Test
    public void testMeterBolaNormal() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA1);
        assertTrue(mesa.bolasCaja().contains(BolaBillar.BOLA1));
        assertFalse(mesa.bolaMesa().contains(BolaBillar.BOLA1));
    }

    @Test
    public void testMeterBolaNegra() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA8);
        assertFalse(mesa.esPartidaIniciada());
    }

    @Test
    public void testMeterBolaSinIniciarPartida() {
        MesaBillar mesa = new MesaBillar();
        assertThrows(IllegalStateException.class, () -> mesa.MeterBola(BolaBillar.BOLA1));
    }

    @Test
    public void testObtenerGanadorEnCurso() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        assertEquals("Esta habiendo un empate", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorLisasGanan() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA1);
        mesa.MeterBola(BolaBillar.BOLA2);
        mesa.MeterBola(BolaBillar.BOLA3);
        mesa.MeterBola(BolaBillar.BOLA4);
        mesa.MeterBola(BolaBillar.BOLA5);
        mesa.MeterBola(BolaBillar.BOLA6);
        mesa.MeterBola(BolaBillar.BOLA7);
        assertEquals("Va ganando las Lisas", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorRayadasGanan() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA9);
        mesa.MeterBola(BolaBillar.BOLA10);
        mesa.MeterBola(BolaBillar.BOLA11);
        mesa.MeterBola(BolaBillar.BOLA12);
        mesa.MeterBola(BolaBillar.BOLA13);
        mesa.MeterBola(BolaBillar.BOLA14);
        mesa.MeterBola(BolaBillar.BOLA15);
        assertEquals("Va ganando las Rayadas", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorEmpate() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA1);
        mesa.MeterBola(BolaBillar.BOLA9);
        assertEquals("Esta habiendo un empate", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorLisasGananDespuesDeTerminar() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA1);
        mesa.MeterBola(BolaBillar.BOLA8);
        assertEquals("Ganaron las Lisas", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorRayadasGananDespuesDeTerminar() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA9);
        mesa.MeterBola(BolaBillar.BOLA8);
        assertEquals("Ganaron las Rayadas", mesa.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorEmpateDespuesDeTerminar() {
        MesaBillar mesa = new MesaBillar();
        mesa.IniciarPartida();
        mesa.MeterBola(BolaBillar.BOLA1);
        mesa.MeterBola(BolaBillar.BOLA9);
        mesa.MeterBola(BolaBillar.BOLA8);
        assertEquals("Empate", mesa.obtenerGanador());
    }
}