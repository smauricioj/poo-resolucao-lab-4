package ifsc.poo.geom;

public class Circulo extends ComArea{
    // Atributos
    private Ponto centro;
    private double raio;

    // Construtores
    public Circulo(double centro_x, double centro_y, double raio){
        this(new Ponto(centro_x, centro_y), raio);
    }

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = (raio > 0) ? raio : 1;
    }

    // Getters e Setters
    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public void setRaio(double raio) {
        this.raio = (raio > 0) ? raio : this.raio;
    }

    // Sobrescrita de métodos
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String desenhar() {
        String msg = "";
        msg += "Círculo centralizado no ponto "+this.centro+",\n\t";
        msg += "de raio "+this.raio+",\n\t";
        msg += "com linha de espessura "+this.espessuraLinha+" e cor "+this.corDaLinha+"\n\t";
        msg += "e preenchimento "+this.corDoPreenchimento+"\n";
        return msg;
    }
}
