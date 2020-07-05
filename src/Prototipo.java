import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prototipo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.println("Informe os valores:");
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);

		System.out.println(list);
		Integer controle = 0;
		for (int i = 1; i < (list.size()) - 1; i++) {
			if (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
				if (list.get(i) > list.get(i + 1) && list.get(i) != 0) {

				}
				controle++;
				if (list.get(i) == 0 && list.get(i-1) == list.get(i+1)) {
					controle++;
					if (list.get(i - 1) > list.get(i) && list.get(i + 1) > list.get(i)) {
						controle++;
					}
				}

			}

		}
		System.out.println(controle);

		sc.close();

	}
}
