package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Szamla> szamlaLista;

    public Bank(int maxSzamlakSzama) {
        this.szamlaLista = new ArrayList<>(maxSzamlakSzama);
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret) {
        if (hitelKeret == 0) {
            MegtakaritasiSzamla Msz = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(Msz);
            return Msz;
        } else {
            HitelSzamla Hsz = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(Hsz);
            return Hsz;
        }
    }

    public int getOszzEgyenleg(Tulajdonos tulajdonos) {
        int sum = 0;

        for (Szamla sz: szamlaLista) {
            if (sz.getTulajdonos() == tulajdonos) {
                sum += sz.getAktualisEgyenleg();
            }
        }

        return sum;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla max = null;

        for (Szamla sz: szamlaLista) {
            if (sz.getTulajdonos() == tulajdonos) {
                if (max == null) {
                    max = sz;
                } else {
                    if (sz.getAktualisEgyenleg() > max.aktualisEgyenleg) {
                        max = sz;
                    }
                }
            }
        }

        return max;
    }

    public long getOsszHitelKeret() {
        long sum = 0;

        for (Szamla sz: szamlaLista) {
            if (sz instanceof HitelSzamla) {
                sum += ((HitelSzamla) sz).getHitelKeret();
            }
        }

        return sum;
    }
}
