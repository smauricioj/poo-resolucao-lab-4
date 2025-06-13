package ifsc.poo.geom;

import java.awt.*;

public class Figura {
    // Atributos
    protected Color corDaLinha;
    protected int espessuraLinha;

    // Construtor
    public Figura() {
        corDaLinha = Color.BLACK;
        espessuraLinha = 1;
    }

    // Getters e Setters
    public final Color getCorDaLinha() {
        return corDaLinha;
    }

    public final void setCorDaLinha(Color corDaLinha) {
        this.corDaLinha = corDaLinha;
    }

    public final int getEspessuraLinha() {
        return espessuraLinha;
    }

    public final void setEspessuraLinha(int espessuraLinha) {
        this.espessuraLinha = espessuraLinha;
    }

    // Métodos para sobrescrever
    public String desenhar() {
        return "";
    }
}
