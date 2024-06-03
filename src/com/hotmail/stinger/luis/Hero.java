package com.hotmail.stinger.luis;

public class Hero {
    private String nome;
    private int idade;
    private String tipo;

    // Construtor para inicializar as propriedades do herói
    public Hero(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para o herói atacar
    public void atacar() {
        String ataque;

        // Verifica o tipo do herói e define a mensagem de ataque apropriada
        switch (this.tipo) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "usou ataque desconhecido";
        }

        // Exibe a mensagem de ataque
        System.out.println("O " + this.tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        // Criação de instâncias de heróis
        Hero heroi1 = new Hero("Gandalf", 2019, "mago");
        Hero heroi2 = new Hero("Conan", 30, "guerreiro");
        Hero heroi3 = new Hero("Shaolin", 40, "monge");
        Hero heroi4 = new Hero("Naruto", 17, "ninja");

        // Invoca o método atacar para cada herói
        heroi1.atacar(); // Saída: O mago atacou usando magia
        heroi2.atacar(); // Saída: O guerreiro atacou usando espada
        heroi3.atacar(); // Saída: O monge atacou usando artes marciais
        heroi4.atacar(); // Saída: O ninja atacou usando shuriken
    }
}
