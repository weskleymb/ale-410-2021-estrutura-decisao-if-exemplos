public class Exemplo04 {

    /*
    Estará aprovado o aluno que estiver com a
    nota acima ou igual a 7.0. Estará em recuperação
    o aluno que estiver com nota entre 7.0 e 3.0,
    caso contrário estará reprovado
     */

    public static void main(String[] args) {

        Double nota = 8.0;

        Boolean aprovado = nota >= 7.0;
        Boolean reprovado = nota < 3.0;

        if (aprovado) {
            System.out.println("Você está APROVADO!!! \\o/");
        } else if (reprovado) {
            System.out.println("Você encontra-se REPROVADO!!! :(");
        } else {
            System.out.println("Você está na RECUPERAÇÃO!!! Vá estudar :|");
        }

    }

}
