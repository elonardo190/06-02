package com.mycompany.retangulo;
import java.util.Scanner;

public class Retangulo {
    int base, altura;
    
      public int getBase  (){
    return base;
    }
   
    public void setBase (int base){
    this.base = base;
    }
    
      public int getAltura  (){
    return altura;
    }
   
    public void setAltura (int altura){
    this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return base + altura;
    }


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo1 = new Retangulo();
    
    System.out.println("De a base do retangulo: ");
    retangulo1.setBase(scanner.nextInt());
    
    System.out.println("De a altura do retangulo: ");
    retangulo1.setAltura(scanner.nextInt());
    
    System.out.println("A area do retangulo e: " + retangulo1.calcularArea());
    System.out.println("A perimetro do retangulo e: " + retangulo1.calcularPerimetro());
    
    
    
    }
}
