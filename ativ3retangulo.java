public class Retangulo extends Quadrilatero {

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        super(base, base, altura, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaPerimetro(){
        return super.calculaPerimetro();
    }

    @Override
    public double calculaArea(){
        double[] ladosRetang = super.getLados();
        return ladosRetang[0]*ladosRetang[2];
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

}
