package e3;

import java.util.Objects;

public record Track(String pos, String recording, String nombre, String album, int segundos) {

    @Override
    public int hashCode(){
        return Objects.hash(recording); //obtiene hash del atributo recording
    }

    @Override
    public boolean equals(Object o){

        Track track = (Track) o; //el objeto o metido se convierte a tipo Track para comprar los recordings

        return Objects.equals(recording, track.recording); //compara si los recordings son iguales segun su recording code
        //el this coge al objeto q llama al metodo y el track.recording es el argumento de la funcion

    }

    public String getRecording(){
        return recording;
    }

    public String getPos(){
        return pos;
    }

    public String getName(){
        return nombre;
    }

    public String getAlbum(){
        return album;
    }

    public int getSec(){
        return segundos;
    }


}
