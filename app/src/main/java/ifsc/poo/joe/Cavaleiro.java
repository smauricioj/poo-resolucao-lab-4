package ifsc.poo.joe;

public class Cavaleiro extends Personagem{
    private static final int MAX_VIDA;
    private static final int DEFAULT_ATAQUE;
    private static final double DEFAULT_VELOCIDADE;

    static {
        MAX_VIDA = 50;
        DEFAULT_ATAQUE = 3;
        DEFAULT_VELOCIDADE = 2.0;
    }

    public Cavaleiro() {
        super(MAX_VIDA, DEFAULT_ATAQUE, DEFAULT_VELOCIDADE);
    }

    @Override
    public String mover(){
        return "O Cavaleiro se move com velocidade "+this.velocidade;
    }

    @Override
    public String atacar(){
        return "O Cavaleiro ataca com ataque "+this.ataque;
    }
}
