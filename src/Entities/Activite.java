package Entities;

public class Activite {
    public int numero;
    public String libelle;

    public Activite(int numero, String libelle) {
        this.numero = numero;
        this.libelle = libelle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
