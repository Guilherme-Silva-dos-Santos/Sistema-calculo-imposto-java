
package impostos;

import java.util.Scanner;
import model.*;

public class Impostos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome da empresa: ");
        String nome = entrada.nextLine();
        
        Pagamento pagamentos = new Pagamento(nome);
        
        // Loop dos cadastros de impostos
        while(true){
            System.out.println("\nDigite o tipo de imposto (PIS/IPI) ou 'pare': ");
            String tipo = entrada.nextLine();
            
            if(tipo.equalsIgnoreCase("pare")){
                break;
            }
            
            if(tipo.equalsIgnoreCase("PIS")){
                System.out.println("Débito: ");
                double debito = entrada.nextDouble();
                
                System.out.println("Crédito: ");
                double credito = entrada.nextDouble();
                entrada.nextLine();
                
                pagamentos.adicionarImposto(new PIS(debito,credito));
            }else if(tipo.equalsIgnoreCase("IPI")){
                System.out.println("Valor produto: ");
                double valor = entrada.nextDouble();
                
                System.out.println("Frete: ");
                double frete = entrada.nextDouble();
                
                System.out.println("Seguro: ");
                double seguro = entrada.nextDouble();
                
                System.out.println("Outras desepesas: ");
                double outras = entrada.nextDouble();
                
                System.out.println("Alíquota (%): ");
                double aliquota = entrada.nextDouble();
                
                entrada.nextLine();
                
                pagamentos.adicionarImposto(new IPI(valor,frete,seguro,outras,aliquota));
            } else {
                System.out.println("Tipo inválido!");
            }
        }
        
        System.out.println("\n=== RESULTADO ===");
        pagamentos.listarImpostos();
        
        entrada.close();
        
    }
    
}
