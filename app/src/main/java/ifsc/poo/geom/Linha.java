package ifsc.poo.geom;

public class Linha extends Figura{
    private final Ponto ini, fim;

    public Linha(double ini_x, double ini_y, double fim_x, double fim_y) {
        this(new Ponto(ini_x, ini_y), new Ponto(fim_x, fim_y));
    }

    public Linha(Ponto ini, Ponto fim) {
        super();
        this.ini = ini;
        this.fim = fim;
    }

    public Ponto getIni() {
        return ini;
    }

    public Ponto getFim() {
        return fim;
    }

    public double comprimento() {
        return ini.dist(fim);
    }

    @Override
    public String desenhar() {
        return "Linha entre os pontos "+this.ini+" e "+this.fim+" com espessura "+this.espessuraLinha+" e cor "+this.corDaLinha;
    }
}
