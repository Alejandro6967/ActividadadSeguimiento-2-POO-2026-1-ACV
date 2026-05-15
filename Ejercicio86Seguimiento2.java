package Seguimiento2;
import java.util.Scanner; // Importamos para pedir datos

public class Ejercicio86Seguimiento2 {

    static class Circulo {

        private int radio;


        public Circulo(int radio) {
            this.radio = radio;
        }


        public int getRadio() { return radio; }
        public void setRadio(int radio) { this.radio = radio; }

        public double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }

        public void imprimir() {
            System.out.println("--- Circulo ---");
            System.out.println("Radio: " + radio + " cm");
            System.out.println("Area: " + calcularArea());
            System.out.println("Perimetro: " + calcularPerimetro());
        }
    }

    static class Rectangulo {
        // 1. ATRIBUTOS (Estado)
        private int base;
        private int altura;

        public Rectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        public int getBase() { return base; }
        public void setBase(int base) { this.base = base; }

        public int getAltura() { return altura; }
        public void setAltura(int altura) { this.altura = altura; }


        // Calcula y devuelve el area de un rectangulo: base * altura
        public double calcularArea() {
            return base * altura;
        }

        public double calcularPerimetro() {
            return (2 * base) + (2 * altura);
        }

        // Imprimir datos
        public void imprimir() {
            System.out.println("--- Rectangulo ---");
            System.out.println("Base: " + base + " cm");
            System.out.println("Altura: " + altura + " cm");
            System.out.println("Area: " + calcularArea());
            System.out.println("Perimetro: " + calcularPerimetro());
        }
    }

    static class Cuadrado {

        private int lado;

        public Cuadrado(int lado) {
            this.lado = lado;
        }

        // Getters y Setters (Encapsulamiento)
        public int getLado() { return lado; }
        public void setLado(int lado) { this.lado = lado; }
        
        public double calcularArea() {
            return lado * lado;
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }

        public void imprimir() {
            System.out.println("--- Cuadrado ---");
            System.out.println("Lado: " + lado + " cm");
            System.out.println("Area: " + calcularArea());
            System.out.println("Perimetro: " + calcularPerimetro());
        }
    }

    static class TrianguloRectangulo {
        private int base;
        private int altura;

        // Constructor
        public TrianguloRectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        public int getBase() { return base; }
        public void setBase(int base) { this.base = base; }

        public int getAltura() { return altura; }
        public void setAltura(int altura) { this.altura = altura; }


        public double calcularArea() {
            return (base * altura) / 2.0;
        }

        public double calcularHipotenusa() {
            return Math.pow(base * base + altura * altura, 0.5);
        }

        public double calcularPerimetro() {
            return base + altura + calcularHipotenusa(); // Invoca  calcularHipotenusa
        }

        // Determinar
        public void determinarTipoTriangulo() {
            if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
                System.out.println("Es un triangulo equilatero"); // Todos sus lados son iguales
            else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
                System.out.println("Es un triangulo escaleno"); // Todos sus lados son diferentes
            else
                System.out.println("Es un triangulo isosceles"); // De otra manera, es isosceles
        }

        // Imprimir datos
        public void imprimir() {
            System.out.println("--- Triangulo Rectangulo ---");
            System.out.println("Base: " + base + " cm");
            System.out.println("Altura: " + altura + " cm");
            System.out.println("Hipotenusa: " + calcularHipotenusa());
            System.out.println("Area: " + calcularArea());
            System.out.println("Perimetro: " + calcularPerimetro());
            determinarTipoTriangulo();
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Registro Circulo");
        System.out.print("Ingrese el radio (cm): ");
        int radio = entrada.nextInt();
        Circulo figura1 = new Circulo(radio);
        
        System.out.println("\nRegistro Rectangulo");
        System.out.print("Ingrese la base (cm): ");
        int baseRect = entrada.nextInt();
        System.out.print("Ingrese la altura (cm): ");
        int alturaRect = entrada.nextInt();
        Rectangulo figura2 = new Rectangulo(baseRect, alturaRect);
        
        System.out.println("\nRegistro Cuadrado");
        System.out.print("Ingrese el lado (cm): ");
        int lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);

        System.out.println("\nRegistro Triangulo Rectangulo");
        System.out.print("Ingrese la base (cm): ");
        int baseTri = entrada.nextInt();
        System.out.print("Ingrese la altura (cm): ");
        int alturaTri = entrada.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTri, alturaTri);

        System.out.println("\nRESULTADOS");

        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());

        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());

        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());

        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        entrada.close();
    }
}