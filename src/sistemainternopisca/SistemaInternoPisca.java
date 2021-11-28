package sistemainternopisca;

import UI_SistemaInterno.UI_Carrinho.itemDeInteresse;
import UI_SistemaInterno.UI_Loading;
import java.util.Scanner;

public class SistemaInternoPisca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UI_Loading loading = new UI_Loading();
        loading.setVisible(true);
        
        
         //carrinho 
         itemDeInteresse item1 = new itemDeInteresse();
          itemDeInteresse item2 = new itemDeInteresse();
          Scanner input = new Scanner(System.in);
          
          //nome item
          
          System.out.println(toString("Item 1"));
          System.out.println("Digite o nome do item: ");
          item1.setNome(input.nextLine());
          
          System.out.println(toString("Item 2"));
          System.out.println("Digite o nome do item: ");
          item2.setNome(input.nextLine());
                    
          input.nextLine();
          
          //quantidade item
          
          System.out.println("Digite a quantidade a ser comprada:");
          item1.getQntd();

         // preço item
         
         int totalItem1 = item1.getPreco()* item1.getQntd();
         
         //valor total
         
         System.out.println("Valor Total:");
         System.out.println(item1.getNome() + "" +item1.getQntd() + "" + "@ $" + totalItem1);
        // System.out.println ("Total: $"+ (totalItem1 + totalItem2));     add item 2 depois, agora o sono tá brabo    

    }

    private static boolean toString(String item_1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
   }

    