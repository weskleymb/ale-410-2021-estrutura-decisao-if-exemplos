public class Exemplo01 {

    /*
    Testar os operadores relacionais

    Boolean => valor lógico
    Integer => número inteiro
    Double => número real
    String => texto
     */

    public static void main(String[] args) {

        Boolean condicao1 = 5 < 3; // false
        System.out.println(condicao1);

        Boolean condicao2 = 10 >= 10; // true
        System.out.println(condicao2);

        Boolean condicao3 = -3 > -20; // true
        System.out.println(condicao3);

        Boolean condicao4 = "TEXTO" == "texto"; // false
        System.out.println(condicao4);

        Boolean condicao5 = "ação" != "acao"; // true
        System.out.println(condicao5);

    }

}
