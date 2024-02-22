package com.mycompany.olamundo;

public class OlaMundo {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 95;
        //c1.tampar();
        c1.destampar();
        c1.status();
        c1.rabiscar();

        c2.modelo = "Faber";
        c2.cor = "Dourada";
        c2.ponta = 0.8;
        c2.carga = 50;
        c2.tampar();
        //c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
