package ifsc.poo.joe;

public class Aldeao extends Personagem{
    public Aldeao() {
        super(25, 1, 0.8);
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
