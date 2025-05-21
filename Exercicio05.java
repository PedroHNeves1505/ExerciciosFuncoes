import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        String resultado = exibirDiaSemana();
        System.out.println(resultado);
    }

    public static String exibirDiaSemana(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("Domingo -- 1");
        System.out.println("Segundo -- 2");
        System.out.println("Terça   -- 3");
        System.out.println("Quarta  -- 4");
        System.out.println("Quinta  -- 5");
        System.out.println("Sexta   -- 6");
        System.out.println("Sabádo  -- 7");
        System.out.println("===============");

        System.out.print("Digite o valor representante do dia da semana que você deseja: ");
        int diaSemana = scanner.nextInt();

        String mensagem;
        switch (diaSemana) {
            case 1:
                mensagem = "Hoje é domingo";
                break;
            case 2:
                mensagem = "Hoje é segunda";
                break;
            case 3:
                mensagem = "Hoje é terça";
                break;
            case 4: 
                mensagem = "Hoje é quarta";
                break;
            case 5:
                mensagem = "Hoje é quinta";
                break;
            case 6:
                mensagem = "Hoje é sexta";
                break;
            case 7:
                mensagem = "Hoje é sábado";
                break;
            default:
                mensagem = "Dia da semana inválido";
                break;
        }

        scanner.close();

        return mensagem;
    }

}
