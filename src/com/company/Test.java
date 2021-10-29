package com.company;

public class Test {
    Bank OTP = new Bank(10);
    Tulajdonos t1 = new Tulajdonos("Feri");
    Tulajdonos t2 = new Tulajdonos("Andris");
    Tulajdonos t3 = new Tulajdonos("Lajos");

    public void test1() {
        OTP.szamlaNyitas(t1, 0).befizet(100000);
        OTP.szamlaNyitas(t1, 0).befizet(120000);
        OTP.szamlaNyitas(t2, 0).befizet(150000);
        OTP.szamlaNyitas(t2, 0).befizet(130000);
        OTP.szamlaNyitas(t2, 0).befizet(20000);
        OTP.szamlaNyitas(t3, 0).befizet(70000);
        OTP.szamlaNyitas(t1, 150000);
        OTP.szamlaNyitas(t2, 200000);
        OTP.szamlaNyitas(t3, 170000);

        System.out.printf("%s legnagyobb eggyenlegu szamlajan %d-Ft van\n", t1.getNev(), OTP.getLegnagyobbEgyenleguSzamla(t1).getAktualisEgyenleg());
        System.out.printf("%s Osszesitett egyenlege: %d-Ft\n", t2.getNev(), OTP.getOszzEgyenleg(t2));
        System.out.printf("A bank altal ugyfeleknek adodd hitelkeretek osszege: %d-Ft\n", OTP.getOsszHitelKeret());
        System.out.printf("%s neve ", t3.getNev());
        t3.setNev("Marci");
        System.out.printf("%s-ra valtozott\n", t3.getNev());
    }
}
