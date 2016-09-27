package excecoesassociacoescolecoesp2;

import java.util.ArrayList;

/*@author yuribrandao*/

public class NotaFiscal {

    private int numero;
    private String nomeCliente;
    private Double total;
    private ArrayList<itemNotaFiscal> itens = new ArrayList<>();

    public NotaFiscal(int numero, String nomeCliente, ArrayList<itemNotaFiscal> itens) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.itens = itens;
    }
//    public Double getTotal(){
//        for(itemNotaFiscal item:itens){
//            total = total + item.getQtde()*item.getPrecoUnit();
//        }
//        return total;
//    }
    
    public Double getTotal(){
        itens.stream().forEach((itemNotaFiscal item) -> {
            total = total + item.getQtde()*item.getPrecoUnit();
        });
        return total;
    }
    
    public boolean adicionarItem(itemNotaFiscal item){
        return itens.add(item);
    }
    
    public Double listaNotas(ArrayList<NotaFiscal> listaNotas){
        Double totalLista = 0.0;
        for(NotaFiscal nota:listaNotas){
            totalLista = totalLista + nota.getTotal();
        }
        return totalLista;
    }
}