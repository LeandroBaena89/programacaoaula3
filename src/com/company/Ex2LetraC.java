package com.company;

import java.util.Scanner;

public class Ex2LetraC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade:");
        int idade = sc.nextInt();
        if (idade <= 10){
            System.out.println("Categoria Infantil");
        }
        else if (idade > 10 && idade <= 17){
            System.out.println("Categoria Juvenil");
        }
        else {
            System.out.println("Categoria Senior");
        }
    }
}


