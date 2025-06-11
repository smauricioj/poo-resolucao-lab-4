package ifsc.poo.joe;

public class Aldeao extends Personagem{
    private static final int MAX_VIDA;
    private static final int DEFAULT_ATAQUE;
    private static final double DEFAULT_VELOCIDADE;

    static {
        MAX_VIDA = 25;
        DEFAULT_ATAQUE = 1;
        DEFAULT_VELOCIDADE = 0.8;
    }

    public Aldeao() {
        super(MAX_VIDA, DEFAULT_ATAQUE, DEFAULT_VELOCIDADE);
    }

    @Override
    public String mover(){
        return "O Aldeão se move com velocidade "+this.velocidade;
    }

    @Override
    public String atacar(){
        return "O Aldeão ataca com ataque "+this.ataque;
    }
}
