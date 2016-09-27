/*
http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
 */
package trabalho5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author yuribrandao
 */
class DVD implements Comparable<DVD>, Comparator<DVD>{
    private String nome, genero;
    protected final Integer Caixa=1;
    private Integer numCaixa;
    
    public DVD(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public int compareTo(DVD o) { return this.nome.compareTo(o.nome); }

    @Override
    public int compare(DVD o1, DVD o2) {  return o1.genero.compareTo(o2.genero);}

    public String getNome() { return this.nome;}

    public String getGenero() {return this.genero;}

}


public class ColecaoDVD {
    
    public final Set <DVD> colecao = new TreeSet<>();
    
    public void exibirPorNome(){
        for (DVD i:colecao)
            System.out.println();
    }
    
    public void exibirPorGenero(){
    
    }

}


//class Menu {
//    public Menu(){}
//    
//    public void exibirMenu(){
//        boolean opcao=true;
//        do{
//
//        }while(opcao);
//    }
//}