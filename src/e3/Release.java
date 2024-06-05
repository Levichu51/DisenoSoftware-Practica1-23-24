package e3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Release {
    private String identificador;
    private String titulo;
    private String mainArtist;
    private List<Track> tracks;

    public Release(String indentificador) {
        this.identificador = indentificador;
        this.tracks = new ArrayList<>(); //se incicializa el identificador pasado por parametro y se crea una nueva lista que contendra los tracks
    }


    @Override
    public String toString(){
        return "Release: id -> " + identificador + ", titulo -> " + titulo + ", artista -> " + mainArtist + ", tracks -> " + tracks +"";
    }


    @Override
    public boolean equals(Object o){

        Release release = (Release) o;

        List<Track> thisTracks = new ArrayList<>(tracks);
        List<Track> otherTracks = new ArrayList<>(release.tracks);

        //Ordena ambas listas de pistas por sus recordings
        thisTracks.sort(Comparator.comparing(Track::getRecording));
        otherTracks.sort(Comparator.comparing(Track::getRecording));

        return thisTracks.equals(otherTracks); //equals de la clase ArrayList

    }

    @Override
    public int hashCode(){
        //segun el recording de cada uno de los albumes tiene el mismo recording, da igual el orden

        List<Track> thisTracks = new ArrayList<>(tracks);
        thisTracks.sort(Comparator.comparing(Track::getRecording));

        return thisTracks.hashCode();
    }


    public void setArtist(String mainArtist){
        this.mainArtist = mainArtist;
    }

    public void setTitle(String titulo){
        this.titulo = titulo;
    }

    public void addTrack(Track track){
        tracks.add(track);
    }

    public String getMainArtist(){
        return this.mainArtist;
    }

    public String getTitle(){
        return this.titulo;
    }

    public void showTracks(){
        for(int i = 0; i < tracks.size(); i++) {
            Track track = tracks.get(i);
            System.out.println("Pos -> " +track.getPos()+ "Recording -> " +track.getRecording()+ "Nombre -> " +track.getName()+ "Album -> " +track.getAlbum()+ "Segundos -> " +track.getSec());
        }

    }

}
