
package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
   Exercicio4 ex4 = new Exercicio4("Esta é uma frase de exemplo para exercício.");

        System.out.println("Frase original: " + ex4.frase);
        System.out.println("Tamanho da frase: " + ex4.tamanhoFrase());
        System.out.println("Maiúsculas: " + ex4.paraMaiusculas());
        System.out.println("Minúsculas: " + ex4.paraMinusculas());
        System.out.println("Substring: " + ex4.extrairSubstring());
    }
}

    