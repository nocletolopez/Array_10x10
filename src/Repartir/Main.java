package Repartir;

public class Main {

	public static void main(String[] args) {

		int matriz[][] = new int[10][10];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				int num = (int) ((Math.random() * 3) + 1);
				matriz[i][j] = num;
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.println(matriz[i][j] + "" + matriz[i][j]);

			}
			
			System.out.println();
		}

	}

}
