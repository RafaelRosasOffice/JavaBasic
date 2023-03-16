public class TypesVariable {
    /*
     * Estudar tipos primitivos;
     * Estudar classe String que representa texto na aplicação.
     */

    /*
     * Oito tipos primitivos
     * int - inteiro
     * byte - inteiro
     * short - inteiro
     * long - inteiro (precisa terminar com L. Ex: long CPF = 221234034L)
     * float - fracionado (precisa terminar com F. Ex: float PI = 3.14F)
     * double - fracionado
     * boolean
     * char
     */

    /*
     * Para declarar uma constante usa-se a palavra reservada "final", seguida do
     * tipo e o nome em caixa alta.
     * Ex: final double VALOR_DE_PI = 3.14;
     */

    // public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    // }

    // Estudo da class String

    /*
     * public static void main(String[] args) {
     * char[] arrayCarac = { 'R', 'a', 'f', 'a', ' ', 'R', 'o', 's', 'a', 's' };
     * String txt = new String("Rafael Rosas");
     * // String txt4 = "Rafael Rosas";
     * 
     * // Três formas de Contrutores da Classe String
     * String tex1 = new String();
     * String tex2 = new String(txt);
     * String tex3 = new String(arrayCarac);
     * 
     * System.out.printf("tex1 = %s%ntex2 = %s%ntex3 = %s%n, tex1, tex2, tex3");
     * }
     */
    // == vai comparar possição de memória
    // equal vai comprar conteúdo do objeto

    public static void main(String[] args) {
        String nome1 = "codando simples";
        String nome2 = new String("codando simples");

        // nome1 = "nada"; // as strings são imutáveis
        String nomeAlterado = nome1.toUpperCase();

        System.out.println(nomeAlterado); // criando uma nova string eu consigo trabalhar uma outra, mas a string
                                          // original nunca é alterada

        // comparação de strings
        if (nome1.equals(nome2)) {
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }

        if (nome1 == nome2) {
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }

        var nome = "rafael ";
        int number = 1;
        System.out.println(nome + number);
        // toUpperCase - converte tudo para maiúsculo
        // toLowerCase - converte tudo para minúsculo
        // length - quantidade de caracteres na estrutura, os 'espaços' contam

        // Rodando o programa pelo prompt de comando:

        /*
         * comando "cd C:" para entrar no diretório do programa java;
         * comando "javac e nome do arquivo com extenção" para gerar um arquivo
         * ".class";
         * comando "java e nome do arquivo sem extenção" para rodar o programa.
         * 
         */
    }
}
