package org.lasencinas;

import static java.lang.Math.PI;

public class Circulo {

        private String nombre = null;
        private double radio = 0d;


 /*--------------------Constructor-----------------*/

        public Circulo(Double radio){
            this.radio = radio;
        }

        public Circulo(String nombre, Double radio){
            this.nombre = nombre;
            this.radio = radio;
        }

/*---------------------Getters----------------------*/

    public String getNombre() {
        return nombre;
    }

    public double getRadio() {
        return radio;
    }

    public Double getArea(){
        return Math.pow(getRadio(), 2) * PI;
    }
}
