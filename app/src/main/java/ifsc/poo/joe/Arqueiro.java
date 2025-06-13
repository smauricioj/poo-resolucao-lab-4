package ifsc.poo.joe;

public class Arqueiro extends Personagem{
    public Arqueiro() {
        super(35, 2, 1.0);
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
