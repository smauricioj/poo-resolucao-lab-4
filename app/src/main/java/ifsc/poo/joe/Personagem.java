package ifsc.poo.joe;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover() {
        return "O personagem genérico se move com velocidade "+this.velocidade;
    }

    public String atacar() {
        return "O personagem genérico ataca com ataque "+this.ataque;
    }
}
