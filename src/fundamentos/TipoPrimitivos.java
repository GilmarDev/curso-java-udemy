package fundamentos;

public class TipoPrimitivos {

  public static void main(String[] args) {
   
    //Tipo numéricos inteiros
    byte anosDeEmpresa = 23;
    short numerodeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 3_134_845_223L;
    
    //Tipos númericos reais
    float salario = 11_445.44f;
    double vendasAcumulados = 2_991_797_103.01;
    
    // Tipo booleano
    boolean estaDeFerias = false; //true
    
    //Tipo caractere
    char status ='A'; //ativo
    
    //Dias de empresa
    System.out.println(anosDeEmpresa * 365);
    
    //Número de viagens
    System.out.println(numerodeVoos / 2);
    
    //Pontos por real
    System.out.println(pontosAcumulados / vendasAcumulados);
    
    System.out.println(id + ": ganha -> " + salario);
    System.out.println("Férias? " + estaDeFerias);
    System.out.println("Status: " + status);

  }

}
