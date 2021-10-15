package fundamentos;

public class Temperatura {
  
  public static void main(String[] args) {
     double fahrenheit = 90;
     double celsius;
     final double AJUSTE = 32;
     final double MULTIPLICADOR = 5/9.0;
     
     celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR ;
     System.out.println("O resultado é :" + celsius + "°C.");
  }

}
