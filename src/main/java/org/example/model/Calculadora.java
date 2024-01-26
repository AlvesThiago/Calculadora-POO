package org.example.model;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    private double num1,num2;

    //Construtor
    public Calculadora() {
        this.num1 = 0;
        this.num2 = 1;
    }

    //Operações

    public double soma(){
        return num1 + num2;
    }

    public double subtracao(){
        return num1 - num2;
    }

    public double multiplicacao(){
        return num1 * num2;
    }

    public double divisao(){
        return num1 / num2;
    }


    //Interface
    public void CallUser(){
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor: ");
            calc.setNum1(scanner.nextDouble());

            System.out.println("Digite outro valor: ");
            calc.setNum2(scanner.nextDouble());

            System.out.println("-------------------------// Calculando \\ ----------------------------");

            System.out.println("Soma: " + calc.soma());
            System.out.println("Subtração: " + calc.subtracao());
            System.out.println("Multiplicação: " + calc.multiplicacao());
            System.out.println("Divisão: " + calc.divisao());


            continuar = calc.verificarNovaOperacao();

        }while(continuar);
    }

    //O código abaixo verifica se o usuário deseja fazer uma nova operação!

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? ( S / N ) ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

    }

    //Setter e Getter
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
