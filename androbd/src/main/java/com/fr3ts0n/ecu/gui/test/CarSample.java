package com.fr3ts0n.ecu.gui.test;

public class CarSample {

   private int telefon;
   private int obd;
   private int avto;
   private int voznik;

   private String opis_poskusa, obtezitev, razdelitev, okna, klima, porabniki, ogretost, zunanji_pogoji, obremenitev, gas;

   private int elementId;


    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getObd() {
        return obd;
    }

    public void setObd(int obd) {
        this.obd = obd;
    }

    public int getAvto() {
        return avto;
    }

    public void setAvto(int avto) {
        this.avto = avto;
    }

    public int getVoznik() {
        return voznik;
    }

    public void setVoznik(int voznik) {
        this.voznik = voznik;
    }

    public String getOpis_poskusa() {
        return opis_poskusa;
    }

    public void setOpis_poskusa(String opis_poskusa) {
        this.opis_poskusa = opis_poskusa;
    }

    public String getObtezitev() {
        return obtezitev;
    }

    public void setObtezitev(String obtezitev) {
        this.obtezitev = obtezitev;
    }

    public String getRazdelitev() {
        return razdelitev;
    }

    public void setRazdelitev(String razdelitev) {
        this.razdelitev = razdelitev;
    }

    public String getOkna() {
        return okna;
    }

    public void setOkna(String okna) {
        this.okna = okna;
    }

    public String getKlima() {
        return klima;
    }

    public void setKlima(String klima) {
        this.klima = klima;
    }

    public String getPorabniki() {
        return porabniki;
    }

    public void setPorabniki(String porabniki) {
        this.porabniki = porabniki;
    }

    public String getOgretost() {
        return ogretost;
    }

    public void setOgretost(String ogretost) {
        this.ogretost = ogretost;
    }

    public String getZunanji_pogoji() {
        return zunanji_pogoji;
    }

    public void setZunanji_pogoji(String zunanji_pogoji) {
        this.zunanji_pogoji = zunanji_pogoji;
    }

    public String getObremenitev() {
        return obremenitev;
    }

    public void setObremenitev(String obremenitev) {
        this.obremenitev = obremenitev;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return
                "telefon=" + telefon +
                ", obd=" + obd +
                ", avto=" + avto +
                ", voznik=" + voznik +
                ", opis_poskusa=" + opis_poskusa +
                ", obtezitev=" + obtezitev +
                ", razdelitev=" + razdelitev +
                ", okna=" + okna +
                ", klima='" + klima +
                ", porabniki=" + porabniki +
                ", ogretost=" + ogretost +
                ", zunanji_pogoji=" + zunanji_pogoji +
                ", obremenitev=" + obremenitev +
                ", gas=" + gas
                ;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }
}
