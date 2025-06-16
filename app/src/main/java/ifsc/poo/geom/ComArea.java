package ifsc.poo.geom;

import java.awt.Color;

public class ComArea extends Figura {
    // Atributos
    protected Color corDoPreenchimento;

    // Construtor
    public ComArea() {
        corDoPreenchimento = Color.GRAY;
    }

    // Getters e Setters
    public final Color getCorDoPreenchimento() {
        return corDoPreenchimento;
    }

    public final void setCorDoPreenchimento(Color corDoPreenchimento) {
        this.corDoPreenchimento = corDoPreenchimento;
    }

    // Métodos para sobrescrever
    public double getArea() {return 0.0;}

    public double getPerimetro() {return 0.0;}
}
