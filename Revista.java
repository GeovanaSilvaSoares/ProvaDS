
public class Revista extends Publicacao{
	
	private int numeroEdicao;
	private String mesPublicacao;
	boolean exibicaoMesPublicacao;
	
	//	Get e set mesPublicacao 
	void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	String getMesPublicacao() {
		return this.mesPublicacao;
	}
	
	//	Get e set numeroEdicao
	void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
	int getNumeroEdicao() {
		return this.numeroEdicao;
	}
	
//	Get e set exibicaoEditora
	void setExibicaoMesPublicacao(boolean exibicaoMesPublicacao) {
		this.exibicaoMesPublicacao = exibicaoMesPublicacao;
	}
	
	boolean getExibicaoMesPublicacao() {
		return this.exibicaoMesPublicacao;
	}
	
	public void publicacao (String titulo, String autor, int anoPublicacao, String mesPublicacao, int numeroEdicao) {
		this.mesPublicacao = mesPublicacao;
		this.numeroEdicao = numeroEdicao;
	}
	
	// Sobreescrevendo construtores e m�todos
	@Override

	String exibirDetalhes (String getTitulo, String getAutor,int getNumeroEdicao) {
		System.out.println("T�tulo: " + getTitulo);
		System.out.println("Autor: " + getAutor);
		return "N�mero da edi��o: " + getNumeroEdicao;
			
	}
		
	String exibirDetalhes (String getMesPublicacao, boolean getExibicaoMesPublicacao, int getAnoPublicacao) {
		if (getExibicaoMesPublicacao == true) {
			System.out.println("M�s de publica��o: " + getMesPublicacao);
		}
		
		return "Ano de publica��o: " + getAnoPublicacao;
	}

	
}
