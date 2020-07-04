import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlvoList {

	public static void main(String[] args) {
		 
		List<Integer> lista = new ArrayList<>();
		List<Integer> resultado = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um alvo:");
		Integer alvo = sc.nextInt();
		
		System.out.println("Informe a quantidade de elementos: ");
		Integer total = sc.nextInt();
		
		System.out.println("Informe os elementos:");
		
		for(int i = 0; i < total; i++) {
			Integer elemento = sc.nextInt();
			lista.add(elemento);
		}
		
		for(int i = 0; i < lista.size(); i++) {
		
			if(lista.get(i) + lista.get(i + 1) == alvo) {
				resultado.add(i);
				resultado.add(i + 1);
				System.out.println("[" + 
				      resultado.get(i) + 
				                   "," + 
				              resultado.
				            get(i + 1) + "]");
				break;
			}
		}
        sc.close();
	}

}
