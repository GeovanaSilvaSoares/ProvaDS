
public class Livro extends Publicacao {

	private int numeroPaginas;
	private String editora;
	private boolean exibicaoEditora;
	
	//	Get e set editora 
	void setEditora(String editora) {
		this.editora = editora;
	}
	
	String getEditora() {
		return this.editora;
	}
	
	//	Get e set numeroPaginas
	void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	//	Get e set exibicaoEditora
	void setExibicaoEditora(boolean exibicaoEditora) {
		this.exibicaoEditora = exibicaoEditora;
	}
	
	boolean getExibicaoEditora() {
		return this.exibicaoEditora;
	}
	
	public void publicacao (String editora, int numeroPaginas) {
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
	}
	
	// Sobreescrevendo construtores e métodos
	@Override
	
	String exibirDetalhes (String getTitulo, String getAutor,int getNumeroPaginas) {
		System.out.println("Título: " + getTitulo);
		System.out.println("Autor: " + getAutor);
		return "Número de páginas: " + getNumeroPaginas;
			
	}
		
	String exibirDetalhes (String getEditora, boolean getExibicaoEditora, int getAnoPublicacao) {
		if (getExibicaoEditora == true) {
			System.out.println("Editora: " + getEditora);
		}
		
		return "Ano de publicação: " + getAnoPublicacao;
	}
}
