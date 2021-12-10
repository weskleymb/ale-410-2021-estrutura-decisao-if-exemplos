public class Exemplo03 {

    /*
    Estará aprovado o aluno que estiver com a
    nota acima ou igual a 7.0, caso contrário
    estará reprovado
     */

    public static void main(String[] args) {

        Double nota = 3.0;

        Boolean aprovado = nota >= 7.0;

        if (aprovado) {
            System.out.println("Você está APROVADO!!! \\o/");
        } else {
            System.out.println("Você encontra-se REPROVADO!!! :(");
        }

    }

}
