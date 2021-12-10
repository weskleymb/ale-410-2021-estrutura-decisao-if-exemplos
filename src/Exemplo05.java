public class Exemplo05 {

    /*
    aproveite o código do exemplo04 e
    dê uma chance ao aluno em recuperação.
    após a nota da recuperação
    verifique se o aluno está aprovado ou reprovado
    na recuperação. A media na recuperação é 5.0.
     */

    public static void main(String[] args) {

        Double nota = 2.0;

        Boolean aprovado = nota >= 7.0;
        Boolean reprovado = nota < 3.0;

        if (aprovado) {
            System.out.println("Você está APROVADO!!! \\o/");
        } else if (reprovado) {
            System.out.println("Você encontra-se REPROVADO!!! :(");
        } else {
            System.out.println("Você está na RECUPERAÇÃO!!! Vá estudar :|");

            Double notaRecuperacao = 8.0;

            Double mediaRecuperacao = (nota + notaRecuperacao) / 2;

            Boolean aprovadoNaRecuperacao = mediaRecuperacao >= 5.0;

            if (aprovadoNaRecuperacao) {
                System.out.println("Aprovado na recuperação");
            } else {
                System.out.println("Reprovado na recuperação");
            }

        }

    }

}
