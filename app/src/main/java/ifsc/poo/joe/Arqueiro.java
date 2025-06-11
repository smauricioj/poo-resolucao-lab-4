package ifsc.poo.joe;

public class Arqueiro extends Personagem{
    private static final int MAX_VIDA;
    private static final int DEFAULT_ATAQUE;
    private static final double DEFAULT_VELOCIDADE;

    static {
        MAX_VIDA = 35;
        DEFAULT_ATAQUE = 2;
        DEFAULT_VELOCIDADE = 1.0;
    }

    public Arqueiro() {
        super(MAX_VIDA, DEFAULT_ATAQUE, DEFAULT_VELOCIDADE);
    }

    @Override
    public String mover(){
        return "O Arqueiro se move com velocidade "+this.velocidade;
    }

    @Override
    public String atacar(){
        return "O Arqueiro ataca com ataque "+this.ataque;
    }
}
