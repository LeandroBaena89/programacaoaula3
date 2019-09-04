package com.company;

import java.util.Scanner;

public class Ex2LetraB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasdefeitos;
        System.out.println("Informe o total de peças com defeitos:");
        pecasdefeitos = sc.nextInt();
        int pecasproduzidas;
        System.out.println("Informe o total de peças produzidas:");
        pecasproduzidas = sc.nextInt();

        if (pecasdefeitos > pecasproduzidas * 0.1) {
            System.out.println("A máquina precisa de manutenção");
        } else {
            System.out.println("A máquina não precisa de manutenção");
        }

    }
}
