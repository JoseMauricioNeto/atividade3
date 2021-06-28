public class Quadrado extends Quadrilatero {
    
    public Quadrado(double lado){
        super(lado, lado, lado, lado);
    }

    @Override
    public double calculaPerimetro(){
        return super.calculaPerimetro();
    }

    @Override
    public double calculaArea(){
        double[] ladosQuadrado = super.getLados();
        return Math.pow(ladosQuadrado[0],2);
    }

    public double getLado(){
        double[] ladosQuadrado = super.getLados();
        return ladosQuadrado[1];
    }

}
