import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        int[] calcular = receberValor();
        int valorMaior = maiorValor(calcular);
        int valorMenor = menorValor(calcular);
        int valorFinal = calculoFinal(valorMaior, valorMenor);
        System.out.println("O resultado do maior valor adcionado " + valorMaior + " somado com o menor valor adcionado " + valorMenor + " dividido por 2 resultou em: " + valorFinal);
    }

    public static int[] receberValor(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listadeNumeros= new ArrayList<>();
        boolean verificar;
        do {
            System.out.print("Você desejar começar/continuar?  true or false: ");
            verificar = scanner.nextBoolean(); 

            if (verificar == true) {
                System.out.print("Digite um valor inteiro: ");
            int valor = scanner.nextInt();
            listadeNumeros.add(valor);
            }

        } while (verificar == true);

        scanner.close();

        int[] numeros = new int[listadeNumeros.size()];
        for (int i = 0; i < listadeNumeros.size(); i++) {
            numeros[i] = listadeNumeros.get(i);
        }

        return numeros;

        }

        public static int maiorValor(int[] calcular){
            int receberMaior = 0;
            for (int numMaior : calcular){
                if (numMaior > receberMaior) {
                  receberMaior = numMaior;
                }
            }

            return receberMaior;
        }


        public static int menorValor(int[] calcular){
            int receberMenor = Integer.MAX_VALUE;
            for (int numMenor : calcular){
                if (numMenor < receberMenor){
                    receberMenor = numMenor;
                }
            }

            return receberMenor;
        } 

        public static int calculoFinal(int max, int min){
            int resposta = (max + min) / 2;

            return resposta;
        }

    }

