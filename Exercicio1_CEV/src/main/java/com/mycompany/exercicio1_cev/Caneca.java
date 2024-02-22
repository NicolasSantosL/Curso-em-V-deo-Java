package com.mycompany.exercicio1_cev;

public class Caneca {

    //Declaração de variáveis
    String cor;
    int litragem;
    boolean liquido;
    boolean alça;


    //Metodos para o liquido (café) da caneca
    void cafeS() {
        this.liquido = true;
    }

    void cafeN() {
        this.liquido = false;
    }

    //Metodo status para informaçoes da caneca
    void status() {

        System.out.println("Status de Cancea: " + "\nCor: " + this.cor + "\nML:" + this.litragem + "\nLiquido:" + this.liquido + "\nAlça:" + this.alça);
    }

    //Metodos para tratar a alça da caneca
    void alcaS() {
        this.alça = true;
    }

    void alcaN() {
        this.alça = false;
    }

    //Metodo para beber (sim ou nao). e com alça (sim ou nao) 
    void beber() {
        if (this.alça == true && this.liquido == true) {
            System.out.println("Voçê bebe o café usando a alça.");
        } else if (this.alça == true && this.liquido == false) {
            System.out.println("Voçê não tem café.");
        } else if (this.alça == false && this.liquido == true) {
            System.out.println("Voçê bebe o café usando o corpo da caneca.");
        } else if (this.alça == false && this.liquido == false) {
            System.out.println("Voçê não tem café.");
        }
    }
}
