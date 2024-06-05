package e4;

import java.util.ArrayList;
import java.util.List;

public class MesaBillar {
    private List<BolaBillar> Cajetin;
    private List<BolaBillar> Mesa;
    private boolean estado;

    public MesaBillar(){
        Cajetin = new ArrayList<>();
        Mesa = new ArrayList<>();

        for(BolaBillar bolaBillar : BolaBillar.values()){
            Cajetin.add(bolaBillar);
        }
    }

    public void IniciarPartida(){
        if(!estado) {
            estado = true;
            Mesa.addAll(Cajetin);
            Cajetin.clear();
        }
        //se incializa la mesa, con estado true (iniciada), se meten las bolas en la Mesa que estaban en el Cajetin y se borra el Cajetin
    }

    public void MeterBola(BolaBillar bolaBillar){
        if(this.estado == true){
            if(bolaBillar == BolaBillar.BLANCA && !Mesa.isEmpty()){ //si la bola es blanca y la mesa no esta vacia se saca y vuelve a meter
                Mesa.remove(bolaBillar);
                Mesa.add(bolaBillar);

            }else if(bolaBillar == BolaBillar.BOLA8){
                System.out.println("Se acabó la partida"); //si se mete el 8 se acaba la partida
                this.estado = false;

            }else{
                Mesa.remove(bolaBillar); //si otro tipo de bola se quita de la mesa y vuelve al cajetin
                Cajetin.add(bolaBillar);
            }

        }else{
            throw new IllegalStateException("Mesa no iniciada o partida terminada"); //si la mesa no esta iniciada salta una excepcion de estado
        }
    }

    public List<BolaBillar> bolaMesa(){
        return this.Mesa;
    }

    public List<BolaBillar> bolasCaja(){
        return this.Cajetin;
    }

    public boolean esPartidaIniciada(){
        return this.estado;
    }

    public String obtenerGanador() {
        int rayadas = 0;
        int lisas = 0;
        String ganador = "";

        for (BolaBillar bola : Mesa) {
            if (bola.getNum() >= 9 && bola.getNum() <= 15) {
                rayadas++;

            } else if (bola.getNum() >= 1 && bola.getNum() <= 7) {
                lisas++;
            }
        }

        if (this.estado == true) {
            if (rayadas > lisas) {
                ganador = "Va ganando las Lisas";

            } else if (lisas > rayadas) {
                ganador = "Va ganando las Rayadas";

            } else {
                ganador = "Esta habiendo un empate";
            }

        } else if (!this.estado) {
            if (rayadas > lisas) {
                ganador = "Ganaron las Lisas";

            } else if (rayadas < lisas) {
                ganador = "Ganaron las Rayadas";

            } else {
                ganador = "Empate";
            }

        }
        return ganador;
    }


}
