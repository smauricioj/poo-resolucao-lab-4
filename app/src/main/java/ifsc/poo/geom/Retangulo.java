package ifsc.poo.geom;

public class Retangulo extends ComArea{
    private Ponto ini, fim;

    public Retangulo(Ponto ini, Ponto fim) {
        this.ini = ini;
        this.fim = fim;
    }

    public Ponto getIni() {
        return ini;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setIni(Ponto ini) {
        this.ini = ini;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    private double largura() {
        return Math.abs(ini.getX() - fim.getX());
    }

    private double altura() {
        return Math.abs(ini.getY() - fim.getY());
    }

    private Ponto centro() {
        return new Ponto(
                (ini.getX() + fim.getX())/2,
                (ini.getY() + fim.getY())/2
        );
    }

    @Override
    public double getArea() {
        return  largura() * altura();
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura() + altura());
    }

    @Override
    public String desenhar() {
        String msg = "";
        msg += "Retangulo de largura "+this.largura()+",\n\t";
        msg += "e altura "+this.altura()+",\n\t";
        msg += "centralizado em x = "+centro().getX()+",\n\t";
        msg += "e y = "+centro().getY()+",\n\t";
        msg += "com linha de espessura "+this.espessuraLinha+" e cor "+this.corDaLinha+"\n\t";
        msg += "e preenchimento "+this.corDoPreenchimento+"\n";
        return msg;

    }
}
