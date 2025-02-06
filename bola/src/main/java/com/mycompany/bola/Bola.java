package com.mycompany.bola;
import java.util.Scanner;

public class Bola {
    public String Cor;
    
    
    public String getCor(){
    return Cor;
    }
    
    public void setCor(String Cor){
    this.Cor = Cor;
    }
    public static void main(String[] args) {
    Bola bola1 = new Bola();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual a cor da bola: ");
    bola1.setCor(scanner.next());
    
     System.out.println("A cor da Bola e: " + bola1.getCor());
    
    }
}
