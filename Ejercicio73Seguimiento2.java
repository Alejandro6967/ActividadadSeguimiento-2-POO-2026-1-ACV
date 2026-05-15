package Seguimiento2;
import java.util.Scanner; // Importamos para pedir datos
public class Ejercicio73Seguimiento2 {

    static class Automovil {
        // 1. ATRIBUTOS (Estado)
        private String marca;
        private int modelo;
        private double motor;
        
        // Enumeraciones definidas dentro de la clase
        enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
        enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
        enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
        
        private tipoCom tipoCombustible;
        private tipoA tipoAutomovil;
        private int numeroPuertas;
        private int cantidadAsientos;
        private int velocidadMaxima;
        private tipoColor color;
        private int velocidadActual = 0; // Inicia en 0

        //constructor
        public Automovil(String marca, int modelo, double motor, tipoCom tipoCombustible, 
                         tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, 
                         int velocidadMaxima, tipoColor color) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
            this.tipoCombustible = tipoCombustible;
            this.tipoAutomovil = tipoAutomovil;
            this.numeroPuertas = numeroPuertas;
            this.cantidadAsientos = cantidadAsientos;
            this.velocidadMaxima = velocidadMaxima;
            this.color = color;
        }

        // metodos (Encapsulamiento)metter getter
        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }

        public int getModelo() { return modelo; }
        public void setModelo(int modelo) { this.modelo = modelo; }

        public double getMotor() { return motor; }
        public void setMotor(double motor) { this.motor = motor; }

        public tipoCom getTipoCombustible() { return tipoCombustible; }
        public void setTipoCombustible(tipoCom tipoCombustible) { this.tipoCombustible = tipoCombustible; }

        public tipoA getTipoAutomovil() { return tipoAutomovil; }
        public void setTipoAutomovil(tipoA tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }

        public int getNumeroPuertas() { return numeroPuertas; }
        public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

        public int getCantidadAsientos() { return cantidadAsientos; }
        public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }

        public int getVelocidadMaxima() { return velocidadMaxima; }
        public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

        public tipoColor getColor() { return color; }
        public void setColor(tipoColor color) { this.color = color; }

        public int getVelocidadActual() { return velocidadActual; }
        public void setVelocidadActual(int velocidadActual) { this.velocidadActual = velocidadActual; }

        // Metodo Comportamiento

        // acelerar; No puede superar la velocidad máxima
        public void acelerar(int incremento) {
            if (velocidadActual + incremento > velocidadMaxima) {
                System.out.println("No se puede acelerar más allá de la velocidad máxima.");
            } else {
                velocidadActual += incremento;
            }
        }

        // Desacelerar: No puede ser menor a 0
        public void desacelerar(int decremento) {
            if (velocidadActual - decremento < 0) {
                System.out.println("No se puede desacelerar a una velocidad negativa.");
            } else {
                velocidadActual -= decremento;
            }
        }

        // Frenar: Pone la velocidad = 0
        public void frenar() {
            velocidadActual = 0;
        }

        // Calcular tiempo llegada
        public double calcularTiempoLlegada(int distancia) {
            if (velocidadActual == 0) return 0;
            return (double) distancia / velocidadActual;
        }

        // Imprimir datos
        public void imprimir() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Motor: " + motor + " litros");
            System.out.println("Tipo de Combustible: " + tipoCombustible);
            System.out.println("Tipo de Automovil: " + tipoAutomovil);
            System.out.println("Numero de Puertas: " + numeroPuertas);
            System.out.println("Cantidad de Asientos: " + cantidadAsientos);
            System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
            System.out.println("Color: " + color);
            System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Registro Automovil");
    
        System.out.print("Ingrese la Marca: ");
        String marca = entrada.nextLine();
    
        System.out.print("Ingrese el Modelo (Año): ");
        int modelo = entrada.nextInt();
    
        System.out.print("Ingrese el cilindraje del Motor: ");
        double motor = entrada.nextDouble();
    
        // Leemos el texto y lo convertimos al valor del menú
        System.out.print("Tipo de Combustible (GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL): ");
        String combustibleTxt = entrada.next().toUpperCase();
        Automovil.tipoCom combustible = Automovil.tipoCom.valueOf(combustibleTxt);
    
        System.out.print("Tipo de Automovil (CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV): ");
        String tipoTxt = entrada.next().toUpperCase();
        Automovil.tipoA tipo = Automovil.tipoA.valueOf(tipoTxt);
    
        System.out.print("Numero de puertas: ");
        int puertas = entrada.nextInt();
    
        System.out.print("Cantidad de asientos: ");
        int asientos = entrada.nextInt();
    
        System.out.print("Velocidad maxima permitida: ");
        int velMax = entrada.nextInt();
    
        System.out.print("Color (BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA): ");
        String colorTxt = entrada.next().toUpperCase();
        Automovil.tipoColor color = Automovil.tipoColor.valueOf(colorTxt);

        // Creamos el objeto con los datos que ingresaste
        Automovil autoUsuario = new Automovil(marca, modelo, motor, combustible, tipo, puertas, asientos, velMax, color);

        System.out.println("\nAuto Creado");
        autoUsuario.imprimir();

        // Probamos la lógica de movimiento
        System.out.print("\n Cuanto quieres acelerar? ");
        int aceleracion = entrada.nextInt();
        autoUsuario.acelerar(aceleracion);
    
        System.out.println("Velocidad actual: " + autoUsuario.getVelocidadActual() + " km/h");
        entrada.close();
    }
}
