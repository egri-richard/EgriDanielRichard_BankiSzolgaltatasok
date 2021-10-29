package com.company;

public class MegtakaritasiSzamla extends Szamla {

    private double kamat;
    public double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void kamatJovairas() {
        befizet((int)(getAktualisEgyenleg() * (kamat/100)));
    }

    @Override
    public boolean kivesz(int osszeg) {
        boolean success = false;

        if ((getAktualisEgyenleg() - osszeg) > 0) {
            success = true;
        }

        return success;
    }
}
