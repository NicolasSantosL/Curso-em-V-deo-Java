package com.mycompany.olamundo;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada ;

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void status() {

        System.out.println("Status da Primeira Caneta:\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "\nTampa: "+ this.tampada);
        //System.out.println("Status da Segunda Caneta:\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nPonta: " +  this.ponta + "\nCarga: " + this.carga + "\nTampa: "+ this.tampada);

    }

    void rabiscar() {

        if (tampada == true) {
            System.out.println("Erro. Não foi possivel rabiscar...");
        } else {
            System.out.println("Estou Rabiscando...");
        }

    }

    /*   void status() {
        
        if (tampada == true) {
            System.out.println("Status da sua Caneta:\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "\nTampa: Tampada");
        } else {
            System.out.println("Status da sua caneta:\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "\nTampa: Destampada" );
        }

    }
     */
}
