package fundamentos;

public class Inferencia {

  public static void main(String[] args) {
    
    double a=4.5; //declara��o e iniciliza��o da var�avel
    System.out.println(a);
    
    a = 12;
    System.out.println(a);
    
    var b = 4.5;
    System.out.println(b);
    
    var c = "Texto";
    System.out.println(c);
    
    c= "Outro Texto";
    System.out.println(c);
    
    double d; //vari�vel foi declarada
    d = 123.56; // vari�vel foi inicializada
    System.out.println(d); //neste momento ela passar ser utilizada
    
    var e = 123.45;
    System.out.println(e);
    
    var f = 12; //inteiro
    System.out.println(f);
    
    /*var e intepretado  pelo Java pelo tipo associado no caso de n�mero com ponto flutuante ser� do tipo double
    com isso n�o � necessidade de declarar o tipo para um determinado valor  */
  }

}
