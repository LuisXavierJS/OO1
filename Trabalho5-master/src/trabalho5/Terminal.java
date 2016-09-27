package trabalho5;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private final List <String> lista= new ArrayList<>();
    
    public Terminal(){};
    
    public Terminal(String[] entradas){
    
    for (String entrada:entradas)
        prompt(entrada);
    }
        
    public void prompt(String entrada) throws IllegalArgumentException{
        try {
            if ('+' == entrada.charAt(0) || '-' == entrada.charAt(0) || "L".equals(entrada)){
                if('+' == entrada.charAt(0))
                    lista.add(entrada.substring(1).toUpperCase());
                else 
                    if('L'== entrada.charAt(0))
                        mostrarlista();
                    else
                        lista.remove(entrada.substring(1).toUpperCase());
            }
            else
                throw new IllegalArgumentException("Argumento Ilegal!");
        }
        catch(IllegalArgumentException e){
            System.out.print("ERRO! Argumento Invalido: "
                        + entrada
                        + "\nUse:\n"
                        + "+nome - Para adicionar\n"
                        + "-nome - Para remover\n"
                        + "L     - Para Listar\n");
        }
    }
    
    public void mostrarlista(){
        int i=1;
        for(String nome:lista)
            System.out.println(i++ + ". " + nome);
    }
}
