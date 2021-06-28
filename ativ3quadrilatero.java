public abstract class Quadrilatero implements Forma {

    private double lado01;
    private double lado02;
    private double lado03;
    private double lado04;
    
    //Construtor
    public Quadrilatero(double lado01, double lado02, double lado03, double lado04){
        this.lado01 = lado01;
        this.lado02 = lado02;
        this.lado03 = lado03;
        this.lado04 = lado04;
    }

    public double calculaPerimetro(){
        return lado01+lado02+lado03+lado04;
    }

    public double[] getLados(){
        double [] lados = new double[4];
        lados[0] = lado01;
        lados[1] = lado02;
        lados[2] = lado03;
        lados[3] = lado04;
        return lados;
    }

}
