import java.util.Scanner;

public class Exemplo06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua nota 01:");
        Double nota1 = entrada.nextDouble();

        System.out.println("Informe a sua nota 02:");
        Double nota2 = entrada.nextDouble();

        System.out.println("Informe a sua nota 03:");
        Double nota3 = entrada.nextDouble();

        System.out.println("Informe a sua nota 04:");
        Double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        final boolean APROVADO = media >= 7.0;
        final boolean REPROVADO = media < 3.0;

        if (APROVADO) {
            System.out.println("Você está APROVADO!!! \\o/");
        } else if (REPROVADO) {
            System.out.println("Você encontra-se REPROVADO!!! :(");
        } else {
            System.out.println("Você está na RECUPERAÇÃO!!! Vá estudar :|");

            System.out.println("Informe a sua nota de recuperação:");
            double notaRecuperacao = entrada.nextDouble();

            double mediaRecuperacao = (media + notaRecuperacao) / 2;

            final boolean aprovadoNaRecuperacao = mediaRecuperacao >= 5.0;

            if (aprovadoNaRecuperacao) {
                System.out.println("Aprovado na recuperação");
            } else {
                System.out.println("Reprovado na recuperação");
            }

        }

    }

}
