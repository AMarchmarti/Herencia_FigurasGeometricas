package org.lasencinas;

public class Rectangulo {

        private String nombre = null;
        private double altura = 0d;
        private double largo = 0d;


        public Rectangulo(Double altura, Double largo){
            this.altura = altura;
            this.largo = largo;
        }


        public Rectangulo(String nombre, Double altura, Double largo){
            this.nombre = nombre;
            this.altura = altura;
            this.largo = largo;
        }

 /*---------------------Getters-----------------------------*/
        public String getNombre() {
                return this.nombre;
            }

        public double getAltura() {
            return this.altura;
        }

        public double getLargo() {
            return this.largo;
        }

        public double getArea(){
            return getAltura() * getLargo();
        }
}
