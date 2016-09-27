package trabalho5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/**
 * @author yuribrandao
 */

public class Trabalho5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColecaoDVD meus = new ColecaoDVD();
        meus.colecao.add(new DVD("xorra","vixi"));
        meus.colecao.add(new DVD("porra","Dixi"));
        meus.colecao.add(new DVD("sorra","uuuixi"));
        meus.colecao.add(new DVD("zorra","aaavixi"));
        
        for(DVD filme : meus.colecao){
            System.out.println(" Filme: "+filme.getNome()+" Genero : "+filme.getGenero());
        }
        
        Collections.sort(meus.colecao, meus.colecao.comparator());
        for(DVD filme : meus.colecao){
            System.out.println(" Genero :"+filme.getGenero()+" Filme: "+filme.getNome());
        }
 
    }
}
