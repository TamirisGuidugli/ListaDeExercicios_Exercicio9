package ListaDeExercicio01_Exercicio9;

import java.util.Scanner;

public class ConversaoDeUnidadesdeTempo {
	
	public static void main(String[] args) {



	      Scanner in = new Scanner(System.in);

	      System.out.println("Digite a unidade de tempo a qual deseja fazer a conversão em horas para calcular a velocidade em KM/h: s (segundo), m (minuto), h (hora), d (dia), sem(semana), mes (mes) e ano (ano) ");
	      String operacao = in.next();

	      System.out.println("Digite o valor da unidade de tempo em horas");
	      int valor1 = in.nextInt();

	      System.out.println("Digite a distancia percorrida em KM");
	      int valor2 = in.nextInt();


	      switch(operacao) {
	        case "s":
	          int conta1 = valor2 / (valor1 * 3600);
	          System.out.println("A velocidade em km/h é " + conta1);
	          break;
	        case "m":
	          int conta2 = valor2 / (valor1 * 60);
	          System.out.println("A velocidade em km/h é: " + conta2);
	          break;
	        case "h":
	          int conta3 = valor2 / valor1;
	          System.out.println("A velocidade em km/h é  " + conta3);
	          break;
	        case "d":
	          int conta4 = valor2 / (valor1 / 86400);
		      System.out.println("A velocidade em km/h é  " + conta4);
		      break;
	        case "mes":
		      int conta5 = valor2 / (valor1 / 259200);
			  System.out.println("A velocidade em km/h é  " + conta5);
			  break;
	        case "ano":
			  int conta6 = valor2 / (valor1 / 31536000);
			  System.out.println("A velocidade em km/h é  " + conta6);
			  break;
		       	       
	        default:
	          System.out.println("Operação não encontrada");
	      }
	      in.close();
	    }
}



