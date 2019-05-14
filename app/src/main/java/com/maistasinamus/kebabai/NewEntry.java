package com.maistasinamus.kebabai;

public class NewEntry {
    private int id;
    private String pavadinimas;
    private String uzpilas;
    private String dydis;
    private String tipas;
    private double kaina;


    //kurian yrasa pries issaugant i db
    public NewEntry(String pavadinimas,String uzpilas,String dydis,String tipas,double kaina) {
        this.pavadinimas=pavadinimas;
        this.uzpilas =uzpilas;
        this.dydis=dydis;
        this.tipas =tipas;
        this.kaina=kaina;
    }

    //darbui su duomenu bazes yrasu
    public NewEntry(int id, String pavadinimas, String uzpilas, String dydis, String tipas, double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.uzpilas = uzpilas;
        this.dydis = dydis;
        this.tipas = tipas;
        this.kaina = kaina;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getUzpilas() {
        return uzpilas;
    }

    public void setUzpilas(String uzpilas) {
        this.uzpilas = uzpilas;
    }

    public String getDydis() {
        return dydis;
    }

    public void setDydis(String dydis) {
        this.dydis = dydis;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }







}
