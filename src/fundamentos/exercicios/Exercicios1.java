package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicios1 {
  
  /*1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.*/

  public static void main(String[] args) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a temperatura : ");
    
    double celsius = teclado.nextDouble();
    //Aqui fazer o calculo pegar a variavel e imprimir o resultado
    teclado.close();
  }
}
