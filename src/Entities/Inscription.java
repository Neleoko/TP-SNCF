package Entities;

public class Inscription {
    public String numeroFormation;
    public String codeAgent;
    public int presence;

    public Inscription(String numeroFormation, String codeAgent, int presence) {
        this.numeroFormation = numeroFormation;
        this.codeAgent = codeAgent;
        this.presence = presence;
    }

    public String getNumeroFormation() {
        return numeroFormation;
    }

    public void setNumeroFormation(String numeroFormation) {
        this.numeroFormation = numeroFormation;
    }

    public String getCodeAgent() {
        return codeAgent;
    }

    public void setCodeAgent(String codeAgent) {
        this.codeAgent = codeAgent;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }
}
