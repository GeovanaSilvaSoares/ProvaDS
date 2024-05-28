import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resp = 1, tipo;
		Livro Livro1 = new Livro();
		Revista Revista1 = new Revista();

		
		
		while (resp == 1) {
			System.out.println("Qual o tipo de livro que você deseja cadastrar? (Digite 1 para Livro ou 2 para Revista)");
			tipo = in.nextInt();
			
			if (tipo == 1) {
				System.out.println("Qual o título do livro?");
				Livro1.setTitulo(in.next());
				
				System.out.println("Qual o nome do autor?");
				Livro1.setAutor(in.next());
				
				System.out.println("Qual o nome da editora?");
				Livro1.setEditora(in.next());
				
				System.out.println("Qual o numero de páginas?");
				Livro1.setNumeroPaginas(in.nextInt());
				
				System.out.println("Qual o ano de publicação?");
				Livro1.setAnoPublicacao(in.nextInt());
				
				System.out.println("Você deseja exibir a editora? (Escreva  'true' para 'Sim' ou 'false' para 'Não')");
				Livro1.setExibicaoEditora(in.nextBoolean());
				
				System.out.println(Livro1.exibirDetalhes(Livro1.getTitulo(), Livro1.getAutor(), Livro1.getNumeroPaginas()));
				System.out.println(Livro1.exibirDetalhes(Livro1.getEditora(), Livro1.getExibicaoEditora(), Livro1.getAnoPublicacao()));
				System.out.println();
				
			}  else if (tipo == 2) {
				System.out.println("Qual o título da revista?");
				Revista1.setTitulo(in.next());
				
				System.out.println("Qual o nome do autor?");
				Revista1.setAutor(in.next());
				
				System.out.println("Qual o ano de publicação?");
				Revista1.setAnoPublicacao(in.nextInt());
				
				System.out.println("Qual mês de publicação??");
				Revista1.setMesPublicacao(in.next());
				
				System.out.println("Qual o número da edição?");
				Revista1.setNumeroEdicao(in.nextInt());
				
				System.out.println("Você deseja exibir o mês de publicação? (Escreva  'true' para 'Sim' ou 'false' para 'Não')");
				Revista1.setExibicaoMesPublicacao(in.nextBoolean());
				
				System.out.println(Revista1.exibirDetalhes(Revista1.getTitulo(), Revista1.getAutor(), Revista1.getNumeroEdicao()));
				System.out.println(Revista1.exibirDetalhes(Revista1.getMesPublicacao(), Revista1.getExibicaoMesPublicacao(), Revista1.getAnoPublicacao()));
				System.out.println();
				
			} else {
				System.out.println("Resposta invalida!");
			}
			
			System.out.println("Deseja cadastrar outro livro?  (Digite 1 para Sim ou 2 para Não)");
			resp = in.nextInt();
		}

	}

}
