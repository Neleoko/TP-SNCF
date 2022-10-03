package Entities;

public class Agent {
    public String code;
    public String civilite;
    public String prenom;
    public String nom;
    public String adresse1;
    public int codePostal;
    public String ville;
    public String imageAgent;

    public Agent(String code, String civilite, String prenom, String nom, String adresse1, int codePostal, String ville, String imageAgent) {
        this.code = code;
        this.civilite = civilite;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse1 = adresse1;
        this.codePostal = codePostal;
        this.ville = ville;
        this.imageAgent = imageAgent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getImageAgent() {
        return imageAgent;
    }

    public void setImageAgent(String imageAgent) {
        this.imageAgent = imageAgent;
    }
}
