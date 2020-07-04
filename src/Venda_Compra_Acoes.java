import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda_Compra_Acoes {

	public static void main(String[] args) {
		
		Integer dia;
		Integer diaCompra;
		Integer precoC;
		Integer diaVenda;
		Integer precoVenda;
		List<Integer> precoV;
		

		
		List<Integer> negociacao = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade e elementos: ");
		Integer qtElementos = sc.nextInt();
		
		for(int i = 0; i < qtElementos; i++){
			System.out.print("Informe o elemento "+(i+1)+":");
			negociacao.add(sc.nextInt());
		}
		System.out.println();
		System.out.print("Escolha um valor para comprar: " + negociacao);
		System.out.println();
		dia = sc.nextInt();
		System.out.print("Você comprou dia " + negociacao.indexOf(dia));
		System.out.println();	
		System.out.print("Preço: " + 
		                           negociacao
		                           .subList(0, negociacao
		                           .indexOf(dia) - 1)
		                           .size());
		System.out.println();
		System.out.println
		("Escolha um dia para vender: " + negociacao);
		diaVenda = sc.nextInt();
		System.out.print("Você vendeu dia " + diaVenda);
		System.out.println();
		System.out.print("Preço: " +
		                           negociacao
		                           .subList(0, diaVenda)
		                           .get(diaVenda-1));
		System.out.println();
		System.out.println("Seu lucro será: " + 
		                                      (negociacao
		                                      .subList(0, diaVenda)
		                                      .get(diaVenda-1) 
		                                      - negociacao
		                                      .subList(0, negociacao
		                                      .indexOf(dia) - 1)
		                                      .size()));
		sc.close();

	}
	

}
