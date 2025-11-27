
package com.prestige.album.tableau;


public class tableRow {
    
    private int numero;
    private String titre;
    private String artiste;
    private boolean explicit;
    private String lectures;
    private String duree;

    public tableRow(int numero, String titre, String artiste, boolean explicit, String lectures, String duree) {
        this.numero = numero;
        this.titre = titre;
        this.artiste = artiste;
        this.explicit = explicit;
        this.lectures = lectures;
        this.duree = duree;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public String getLectures() {
        return lectures;
    }

    public void setLectures(String lectures) {
        this.lectures = lectures;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
    
    
    
}
