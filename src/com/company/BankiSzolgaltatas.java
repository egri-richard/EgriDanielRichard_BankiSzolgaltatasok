package com.company;

public abstract class BankiSzolgaltatas {

    private Tulajdonos t;

    public BankiSzolgaltatas(Tulajdonos t) {
        this.t = t;
    }

    public Tulajdonos getT() {
        return t;
    }
}
