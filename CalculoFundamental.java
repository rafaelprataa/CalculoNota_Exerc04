package exercicios;
import java.util.Scanner;
public class CalculoFundamental {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, nota3, media; // declarando variaveis
		int codigo;
	
		do {  // Laço de repetição
			System.out.println("Digite o codigo do aluno, um codigo no numero 0 encerra o programa:"); // informei para o usuario digitar o codigo do aluno
			codigo = entrada.nextInt(); // 
			
			if (codigo ==0) { // caso o codigo retorne 0, encerre o programa
				System.out.println("FIM");
			}else // caso não seja 0, o programa continua normalmente
			
			
			System.out.println("Digite a nota 1:"); // pedi para o usuario informar a nota 1, e assim respectivamente
			nota1 = entrada.nextDouble();
			
			System.out.println("Digite a nota 2:");
			nota2 = entrada.nextDouble();
			
			System.out.println("Digite a nota 3:");
			nota3 = entrada.nextDouble();
			
			
			media = (nota1+nota2+nota3) /3; // para calcular uma média aritmetica, some todas as notas e divida pela quantidade.
			
			System.out.println("Sua média aritmética é: " + media); //informa a média do aluno
			
			if (media >=8) { //caso média seja maior ou igual a 8...
				System.out.println("PARABÉNS VOCÊ FOI APROVADO"); // informe que o aluno foi aprovado
			}else if (media >6 && media <8) { // caso media seja maior que 6, e menor que 8...
				System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO!"); // informe que o aluno está de recuperação
			}else { // caso a nota não seja correspondente a nenhuma das lógicas acima...
				System.out.println("VOCÊ FOI REPROVADO!"); // informe que o aluno foi reprovado
			}
		 	}while (codigo!=0); // caso o codigo do aluno seja diferente do que 0, reinicia o programa
		entrada.close(); // scanner fechado
	}

}
