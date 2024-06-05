package e4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BolaBillarTest {

    @Test
    public void testValoresBolas() {
        assertEquals(0, BolaBillar.BLANCA.getNum());
        assertEquals("BLANCO", BolaBillar.BLANCA.getColor());
        assertEquals("LISA", BolaBillar.BLANCA.getTipo());

        assertEquals(1, BolaBillar.BOLA1.getNum());
        assertEquals("AMARILLO", BolaBillar.BOLA1.getColor());
        assertEquals("LISA", BolaBillar.BOLA1.getTipo());

        assertEquals(2, BolaBillar.BOLA2.getNum());
        assertEquals("AZUL", BolaBillar.BOLA2.getColor());
        assertEquals("LISA", BolaBillar.BOLA2.getTipo());

        assertEquals(3, BolaBillar.BOLA3.getNum());
        assertEquals("ROJO", BolaBillar.BOLA3.getColor());
        assertEquals("LISA", BolaBillar.BOLA3.getTipo());

        assertEquals(4, BolaBillar.BOLA4.getNum());
        assertEquals("VIOLETA", BolaBillar.BOLA4.getColor());
        assertEquals("LISA", BolaBillar.BOLA4.getTipo());

        assertEquals(5, BolaBillar.BOLA5.getNum());
        assertEquals("NARANJA", BolaBillar.BOLA5.getColor());
        assertEquals("LISA", BolaBillar.BOLA5.getTipo());

        assertEquals(6, BolaBillar.BOLA6.getNum());
        assertEquals("VERDE", BolaBillar.BOLA6.getColor());
        assertEquals("LISA", BolaBillar.BOLA6.getTipo());

        assertEquals(7, BolaBillar.BOLA7.getNum());
        assertEquals("GRANAT3", BolaBillar.BOLA7.getColor());
        assertEquals("LISA", BolaBillar.BOLA7.getTipo());

        assertEquals(8, BolaBillar.BOLA8.getNum());
        assertEquals("NEGRO", BolaBillar.BOLA8.getColor());
        assertEquals("LISA", BolaBillar.BOLA8.getTipo());

        assertEquals(9, BolaBillar.BOLA9.getNum());
        assertEquals("AMARILLO", BolaBillar.BOLA9.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA9.getTipo());

        assertEquals(10, BolaBillar.BOLA10.getNum());
        assertEquals("AZUL", BolaBillar.BOLA10.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA10.getTipo());

        assertEquals(11, BolaBillar.BOLA11.getNum());
        assertEquals("ROJO", BolaBillar.BOLA11.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA11.getTipo());

        assertEquals(12, BolaBillar.BOLA12.getNum());
        assertEquals("VIOLETA", BolaBillar.BOLA12.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA12.getTipo());

        assertEquals(13, BolaBillar.BOLA13.getNum());
        assertEquals("NARANJA", BolaBillar.BOLA13.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA13.getTipo());

        assertEquals(14, BolaBillar.BOLA14.getNum());
        assertEquals("VERDE", BolaBillar.BOLA14.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA14.getTipo());

        assertEquals(15, BolaBillar.BOLA15.getNum());
        assertEquals("GRANATE", BolaBillar.BOLA15.getColor());
        assertEquals("RAYADA", BolaBillar.BOLA15.getTipo());
    }
}