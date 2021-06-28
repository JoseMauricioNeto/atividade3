public class Circulo implements Forma{

    private double raio;

    public Circulo(){
        this.raio = 1.0;
    }

    public Circulo(double raio){
        this.raio = raio;
    }   

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double calculaPerimetro(){
        return raio*2*Math.PI;
    }

    public double calculaArea(){
        return Math.PI*Math.pow(raio,2);
    }

}
