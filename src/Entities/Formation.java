package Entities;

public class Formation {
    public String code;
    public int numeroActivite;
    public String initule;

    public Formation(String code, int numeroActivite, String initule) {
        this.code = code;
        this.numeroActivite = numeroActivite;
        this.initule = initule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumeroActivite() {
        return numeroActivite;
    }

    public void setNumeroActivite(int numeroActivite) {
        this.numeroActivite = numeroActivite;
    }

    public String getInitule() {
        return initule;
    }

    public void setInitule(String initule) {
        this.initule = initule;
    }
}
