
package dbweb;

//
///*
//  id numeric NOT NULL,
//  koodi numeric NOT NULL,
//  ryhmakoodi numeric NOT NULL,
//  ryhma character varying(20),
//  kuvaus character varying(30),
//  lisainfo character varying(50)
//)
// */
//
///**
// *
// * @author pakars4
// */


public class Koodisto{

    private int id;
    private int koodi;
    private int ryhmakoodi;
    private String ryhma;
    private String kuvaus;
    private String lisainfo;
    
    
    public Koodisto(){
        
    }

    public Koodisto(int id, int koodi, int ryhmakoodi, String ryhma, String kuvaus, String lisainfo) {
        this.id = id;
        this.koodi = koodi;
        this.ryhmakoodi = ryhmakoodi;
        this.ryhma = ryhma;
        this.kuvaus = kuvaus;
        this.lisainfo = lisainfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKoodi() {
        return koodi;
    }

    public void setKoodi(int koodi) {
        this.koodi = koodi;
    }

    public int getRyhmakoodi() {
        return ryhmakoodi;
    }

    public void setRyhmakoodi(int ryhmakoodi) {
        this.ryhmakoodi = ryhmakoodi;
    }

    public String getRyhma() {
        return ryhma;
    }

    public void setRyhma(String ryhma) {
        this.ryhma = ryhma;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public String getLisainfo() {
        return lisainfo;
    }

    public void setLisainfo(String lisainfo) {
        this.lisainfo = lisainfo;
    }

 
}
