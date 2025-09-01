package exercicio04;

public class Exercicio4 {

    String frase;

    public Exercicio4(String frase) {
        this.frase = frase;
    }

    public int tamanhoFrase() {
        return frase.length();
    }

    // 2. Converte para maiúsculas
    public String paraMaiusculas() {
        return frase.toUpperCase();
    }

    // 3. Converte para minúsculas
    public String paraMinusculas() {
        return frase.toLowerCase();
    }

    // 4. Extrai substring "frase de exemplo"
    public String extrairSubstring() {
        return frase.substring(10, 26); // posição do trecho
    }
}