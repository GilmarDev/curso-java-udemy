package fundamentos;

import java.util.Scanner;

public class CalculoSalario {

  public static void main(String[] args) {

    //Desafio Conversão
    String primeiroSalario;
    String segundoSalario;
    String terceiroSalario;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro salário : ");
    primeiroSalario = teclado.nextLine().replace(".", ",");

    System.out.println("Digite o segundo salário : ");
    segundoSalario = teclado.nextLine().replace(".", ",");

    System.out.println("Digite o terceiro salário: ");
    terceiroSalario = teclado.nextLine().replace(".", ",");
    
    double valor1 = Double.parseDouble(primeiroSalario);
    double valor2 = Double.parseDouble(segundoSalario);
    double valor3 = Double.parseDouble(terceiroSalario);
    
    double soma = (valor1 + valor2 + valor3) / 3;

    System.out.printf("A soma do salário foi :" + "R$" + soma);
    teclado.close();
  }

}
