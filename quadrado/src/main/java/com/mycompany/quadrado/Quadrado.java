package com.mycompany.quadrado;
import java.util.Scanner;

public class Quadrado {
    public int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.print("Digite o valor do lado do quadrado: ");
        quadrado.setLado(scanner.nextInt());

        System.out.println("A area do quadrado e: " + quadrado.calcularArea());

        scanner.close();
    }
}
