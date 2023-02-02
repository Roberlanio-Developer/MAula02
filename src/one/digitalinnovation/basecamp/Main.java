package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        // Quadrilátero de retorno

        System.out.println("Exercício quadrilátero");
        double areaLosango = Quadrilatero.area(5f,5f);
        System.out.println("Área do losango: " + areaLosango);
        double aereaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do Quadrado: "+ aereaQuadrado);
        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área de retângulo: "+ areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
       
    }
}
