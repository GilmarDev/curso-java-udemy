package fundamentos.operadores;

public class DesafioLogicos {

  public static void main(String[] args) {
    
    
    boolean trabalho1 = false;
    boolean trabalho2 = false;
    
    boolean comprouTV50 = trabalho1 && trabalho2;
    boolean comprouTV32 = trabalho1 ^ trabalho2;
    boolean comprouSorvete = trabalho1 || trabalho2;
    
    //Operador Un�rio!
    boolean maisSaudavel = !comprouSorvete;
    
    System.out.println("Comprou TV 50\"? " + comprouTV50);
    System.out.println("Comprou TV 50\"? " + comprouTV32);
    System.out.print("Mais saud�vel ? " + maisSaudavel);
  }

}
