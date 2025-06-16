package ifsc.poo.joe;

public class Cavaleiro extends Personagem{
    public Cavaleiro() {
        super(50, 3, 2.0);
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
