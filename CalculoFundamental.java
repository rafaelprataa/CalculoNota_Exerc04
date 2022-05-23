package exercicios;
import java.util.Scanner;
public class CalculoFundamental {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, nota3, media;
		int codigo;
	
		do {
			System.out.println("Digite o codigo do aluno, um codigo no numero 0 encerra o programa:");
			codigo = entrada.nextInt();
			
			if (codigo ==0) {
				System.out.println("FIM");
			}else
			
			
			System.out.println("Digite a nota 1:");
			nota1 = entrada.nextDouble();
			
			System.out.println("Digite a nota 2:");
			nota2 = entrada.nextDouble();
			
			System.out.println("Digite a nota 3:");
			nota3 = entrada.nextDouble();
			
			
			media = (nota1+nota2+nota3) /3;
			
			System.out.println("Sua média aritmética é: " + media);
			
			if (media >=8) {
				System.out.println("PARABÉNS VOCÊ FOI APROVADO");
			}else if (media >6 && media <8) {
				System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO!");
			}else {
				System.out.println("VOCÊ FOI REPROVADO!");
			}
		 	}while (codigo!=0);
		entrada.close();
	}

}
