package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
  
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o nome do dia da semana: ");
    
    String diaSemana = teclado.nextLine();
    
    
    if("domingo".equalsIgnoreCase(diaSemana)) {
       System.out.println(1);
      
    }else if("segunda-feira".equalsIgnoreCase(diaSemana) || "segunda-feira".equalsIgnoreCase(diaSemana)) {
       System.out.println(2);

     }else if("ter�a-feira".equalsIgnoreCase(diaSemana) || "ter�a-feira".equalsIgnoreCase(diaSemana)) {
        System.out.println(3);
          
      }else if("quarta-feira".equalsIgnoreCase(diaSemana) || "quarta-feira".equalsIgnoreCase(diaSemana)) {
         System.out.println(4);
         
       }else if("quinta-feira".equalsIgnoreCase(diaSemana) || "quinta-feira".equalsIgnoreCase(diaSemana)) {
          System.out.println(5);
         
        }else if("sexta-feira".equalsIgnoreCase(diaSemana) || "sexta-feira".equalsIgnoreCase(diaSemana)) {
           System.out.println(6);
          
         }else if("s�bado".equalsIgnoreCase(diaSemana) || "s�bado".equalsIgnoreCase(diaSemana)) {
            System.out.println(7);
           
         }else {
            System.out.println("N�o corresponder ao dia da semana v�lido");
         }
    
 
    System.out.println("Fim!");
    teclado.close();
  
  }
  }
