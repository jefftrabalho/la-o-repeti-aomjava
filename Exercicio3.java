package laçosDeRepetiçao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de
		pessoas com menos de 21 anos. Total de pessoas com mais de
		50 anos. O programa termina quando idade for 99 */
		
		
	
		Scanner entrada = new Scanner (System.in);
		
		
		int idade = 0;
		int total21= 0 ;
		int total50 = 0;
		
		while(idade < 99) {
			System.out.println("insira idade");
			idade = entrada.nextInt();
			
			if(idade <= 21) {
				total21 += idade;
				System.out.println(total21);	
			}else if(idade>50) {
				total50 += idade;
				System.out.println(total50);
			}
			
		}
			entrada.close();
	}

}
