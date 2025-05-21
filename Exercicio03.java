import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        int[] valores = receberValor();

        int maior = encontrarmax(valores[0], valores[1]);
        System.out.println("O maior valor é o: " + maior);
    }

    public static int[] receberValor(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        scanner.close();

        return new int[]{valor1, valor2};
    }

    public static int encontrarmax(int n1, int n2){
        if (n1 > n2) {
            return n1;
        } else{
            return n2;
        }
    }
}
