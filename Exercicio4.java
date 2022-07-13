package laçosDeRepetiçao;


import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150*/
		int opcoes;
		int sexo ;
		int idade;
		int pessoas = 2;
		int contador = 0;
		int feminino;
		int masculino;
		int outros;
		int pessoasCalma = 0;
		int pessoasNervosa = 0;
		int pessoasAgressiva = 0;
		Random gerador = new Random();
		Scanner entrada = new Scanner(System.in);
		
		while(contador<150) {
			idade = gerador.nextInt(120);
			sexo = gerador.nextInt(3)+1;
			opcoes = gerador.nextInt(3)+1;
			
			if(opcoes==1) {
				System.out.println("pessoa calma");
			}
			contador++;
		}
	
	}

}
