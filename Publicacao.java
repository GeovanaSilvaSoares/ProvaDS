
public class Publicacao {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	
	//	Get e set Titulo
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	
	//	Get e set Autor 
	void setAutor(String autor) {
		this.autor = autor;
	}
	
	String getAutor() {
		return this.autor;
	}
	
	//	Get e set AnoPublicacao
	void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	
	// Construtor
	public void publicacao (String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
		
	// Método exibirDetalhes()
	String exibirDetalhes (String getTitulo, String getAutor, int getAnoPublicacao) {
		System.out.println("Título: " + getTitulo);
		System.out.println("Autor: " + getAutor);
		return "Ano de publicação: " + getAnoPublicacao;
	}
	
}
