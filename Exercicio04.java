import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int[] numeros = receberValor();
        isPar(numeros);
    }

    public static int[] receberValor() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int continuar;

        do {
            System.out.println("Você deseja continuar? (Digite 0 para sair ou qualquer outro número para continuar): ");
            continuar = scanner.nextInt();

            if (continuar != 0) {
                System.out.print("Digite um valor inteiro: ");
                int valor = scanner.nextInt();
                listaNumeros.add(valor);
            }

        } while (continuar != 0);

        scanner.close();

        int[] numeros = new int[listaNumeros.size()];
        for (int i = 0; i < listaNumeros.size(); i++) {
            numeros[i] = listaNumeros.get(i);
        }

        return numeros;
    }

    public static void isPar(int[] numeros) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }
    }
}
