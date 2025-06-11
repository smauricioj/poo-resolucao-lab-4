package ifsc.poo.geom;

import java.awt.*;

public class Figura {
    // Estáticos
    private static final Color COR_DA_LINHA_DEFAULT;
    private static final int ESPESSURA_LINHA_DEFAULT;

    static {
        COR_DA_LINHA_DEFAULT = Color.BLACK;
        ESPESSURA_LINHA_DEFAULT = 1;
    }

    // Atributos
    protected Color corDaLinha;
    protected int espessuraLinha;

    // Construtor
    public Figura() {
        corDaLinha = COR_DA_LINHA_DEFAULT;
        espessuraLinha = ESPESSURA_LINHA_DEFAULT;
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
