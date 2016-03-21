
public class CavalinhoDoBozo {
	
	
	
	 public static void main(String args[]){

		 Cavalo [] c = new Cavalo[3];
		 c[0] = new Cavalo("BRANQUINHO");
		 c[1] = new Cavalo("MALHADINHO");
		 c[2] = new Cavalo("PRETINHO");
	 
		 while (true){
			 System.out.println("                                                                           \\/FIM!");
			 for (Cavalo atual:c){
				 if (atual.distanciaAtual >= 60.0){
					 System.out.println(atual.nome+" Ganhou!");
					 return;
				 }
				 atual.Correr();
				 atual.Mostrar();
				 
			 }
			 try {
				    //thread to sleep for the specified number of milliseconds
				    Thread.sleep(100);
				} catch ( java.lang.InterruptedException ie) {
				    System.out.println(ie);
				}
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		 }
	}
}

class Cavalo{
	String nome;
	String[] nomesPossiveis = {"BRANQUINHO","MALHADINHO","PRETINHO"};
	String icone;
	Double distanciaAtual;


	public Cavalo(String nome) {
		super();
		for (String nomeCandidato:nomesPossiveis){
			if (nome.equals(nomeCandidato)){
				this.nome = nome;
				this.icone = this.nome.substring(0, 1)+">";
			}
			else{
				this.nome = nome;
				this.icone = this.nome.substring(0, 1)+">";
			}
		}
		this.distanciaAtual = 0.0;
	}

	/*  2) a correr, que sorteia um n�mero real entre 0 e 1, acumula esse valor a
	 *  sua dist�ncia percorrida (n�mero real) e chama a fun��o privada mostrar do objeto,
	 *  e retorna a dist�ncia atual j� percorrida pelo cavalo; */
	public void Correr(){
		this.distanciaAtual += Math.random();
		
	}
	/*3) o m�todo privado mostrar, que exibe no console um linha com o nome do cavalo e,
	 *  ao lado, o caractere avatar dele, distante n caracteres da posi��o do dois pontos,
	 *   sendo n a parte inteira da dist�ncia percorrida. Considerando a dist�ncia zero,
	 *    a situa��o inicial da tela ser� a seguinte:
	 *    BRANQUINHO: B>
	 *    MALHADINHO: M>
	 *    PRETINHO: P>
	 */
	 public static String repetir(int count, String com) {
		    return new String(new char[count]).replace("\0", com);
		}
	 
	public void Mostrar(){
		
		System.out.print(this.nome+'\t'+':');
		System.out.println(repetir(this.distanciaAtual.intValue(), " ")+this.icone);
		
		
	}
	
	
	
}