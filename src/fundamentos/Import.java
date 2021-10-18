package fundamentos;

import java.util.Date;

import javax.swing.JButton;
//Os imports ficam forar da classe 
public class Import {

  public static void main(String[] args) {
    
    //Aulas sobre o import
    
    //a classe String ao ser utilizada por padrão o java já faz o import pois pertence ao java.lang
    String s = "Bom dia";
    System.out.println(s);
    
    Date d = new Date();
    System.out.println(d);
    
    JButton botao = new JButton();
    
    //Atalho no teclado ctrl+shift+O faz os import ou retirar os import que não estão sendo utilizado.

  }

}
