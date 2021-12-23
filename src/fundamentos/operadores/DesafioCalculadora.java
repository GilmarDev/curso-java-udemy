package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
  
  public static void main(String[] args) {
    
  Scanner teclado = new Scanner(System.in);
  
  System.out.println("Informe o número: ");
  double numero1 = teclado.nextDouble();
  
  System.out.print("Informe o número: ");
  double numero2 = teclado.nextDouble();
  
  System.out.print("Informe a operação");
  String operacao = teclado.next();
  
  
  double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
  resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
  resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
  resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
  resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
  
  System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao,numero2, resultado);  
  
  teclado.close();
} 
 
}
