import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        int numero = receberNum();
        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            int resultado = calculo(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
    }

    public static int receberNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para calcularmos seu fatorial");
        int valor = scanner.nextInt();

        scanner.close();

        return valor;
    }

    public static int calculo(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
