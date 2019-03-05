package org.lasencinas;


public class MainFiguras
{
    public static void main( String[] args )
    {
        Rectangulo rectangulo = new Rectangulo (4d,5d);
        Rectangulo rectanguloSuper = new Rectangulo("rectangulo", 4d, 5d);

        Circulo circulo = new Circulo(5d);
        Circulo circuloSuper = new Circulo("circulo", 5d);

        System.out.println( "Area del " + rectanguloSuper.getNombre() + "= " + rectangulo.getArea() );
        System.out.println( "Area del " + circuloSuper.getNombre() + "= " + circulo.getArea() );
    }
}
