
package model;

import java.util.ArrayList;
import java.util.List;


public class Pagamento {
    private String nomeEmpresa;
    private List<Imposto> impostos;

    public Pagamento(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }
    
    public void adicionarImposto(Imposto imposto){
        impostos.add(imposto);
    }
    
    public void listarImpostos(){
        for(Imposto imp : impostos){
            System.out.println("Imposto: "+imp.getDescricao());
            System.out.println("Valor: R$ "+imp.calcularImposto());
            System.out.println("--------------------------");
        }
    }
    
    //Getters e Setters

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    }
    
}
