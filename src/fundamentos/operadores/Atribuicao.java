package fundamentos.operadores;

public class Atribuicao {
  
  public static void main(String[] args) {
    
    int a = 3; //valor 3 é atribuindo a variavel a
    int b = a; // a variavel contém o valor atribuir esse valor a variavel b.
    int c = a + b; /*aqui temos uma expressão de dois operador aonde e feito primeiro a somar dos valores dessas 
                     variaves somente depois variavel c passar a vale o resultado dessa expressão*/
    
    c += b; // e mesmo que c = c + b;
    c -= a; // e mesmo que c = c - a;
    c *= b; // e mesmo que c = c * b;
    c /= b; // e mesmo que c = c / b;
    System.out.println(c);
    
    c %= 2;// e mesmo que c = c  % 2; 0 é par  ou 1 é impar
    System.out.println(c);
    
    int i = 0;
    i = i + 1;
    i += 1;
    System.out.println(i);
    
   }

}
