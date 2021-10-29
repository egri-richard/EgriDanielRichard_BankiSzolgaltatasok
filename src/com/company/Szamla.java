package com.company;

public class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        this.aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg) {
        return false;
    }

    public Kartya UjKartya(String kartyaSzam) {
        return new Kartya(this.getTulajdonos(), this, kartyaSzam);
    }
}
