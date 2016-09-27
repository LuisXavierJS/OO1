package excecoesassociacoescolecoesp2;

import java.util.ArrayList;

/* @author yuribrandao  */

public class Titular extends Pessoa{
    private int matricula;
    private ArrayList <Dependente> dependentes= new ArrayList<>();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void adicionarDependente(Dependente d) throws ExcessoDependentesException{
        if(dependentes.size()<=10)   dependentes.add(d);
        else
            throw new ExcessoDependentesException("Numero maximo de dependentes atingido!");
    }

    private static class ExcessoDependentesException extends Exception {

        public ExcessoDependentesException(String mensagem) {
        }
    }
}
