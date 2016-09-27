package excecoesassociacoescolecoesp2;

/*@author yuribrandao*/

public class itemNotaFiscal {

    private int codigo;
    private int qtde;
    private Double precoUnit;
    
    public itemNotaFiscal(int codigo, Double precoUnit, int qtde) {
        this.codigo = codigo;
        this.precoUnit = precoUnit;
        this.qtde = qtde;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtde() {
        return qtde;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }
}
