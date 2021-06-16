public class principal {
    
    public static void main(String[] args) {
        
        Quadrado quadrad = new Quadrado(2);
        Circulo circul = new Circulo(5);
        Retangulo retang = new Retangulo(12, 10);

        //Quadrado
        System.out.println("*******Quadrado*******");
        System.out.println(quadrad.getLado());
        System.out.println(quadrad.calculaArea());
        System.out.println(quadrad.calculaPerimetro());
        System.out.println();

        //Circulo
        System.out.println("********Circulo*********");
        System.out.println(circul.getRaio());
        System.out.println(circul.calculaArea());
        System.out.println(circul.calculaPerimetro());
        System.out.println();

        //Retangulo
        System.out.println("********Retangulo*********");
        System.out.println("Altura: " + retang.getAltura()+" - Base: "+ retang.getBase());
        System.out.println(retang.calculaArea());
        System.out.println(retang.calculaPerimetro());
    }
}
