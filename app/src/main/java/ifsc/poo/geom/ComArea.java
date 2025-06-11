package ifsc.poo.geom;

import java.awt.Color;

public class ComArea extends Figura {
    // Estáticos
    private static final Color COR_DO_PREENCHIMENTO_DEFAULT;

    static {
        COR_DO_PREENCHIMENTO_DEFAULT = Color.GRAY;
    }

    // Atributos
    protected Color corDoPreenchimento;

    // Construtor
    public ComArea() {
        corDoPreenchimento = COR_DO_PREENCHIMENTO_DEFAULT;
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
