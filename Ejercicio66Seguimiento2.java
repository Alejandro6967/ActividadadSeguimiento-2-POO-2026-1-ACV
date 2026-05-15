package Seguimiento2;
import java.util.Scanner; // Importamos para pedir datos

public class Ejercicio66Seguimiento2 {
    
    // Metemos la clase Planeta AQUÍ ADENTRO y con "static" para que no pelee con otros archivos
    static class Planeta {
        
        // Atributo define el nombre de un planeta
        String nombre = null;
        int cantidadSatelites = 0;
        double masa = 0;
        double volumen = 0;
        double diametro = 0; // Lo pusimos en double para que el Scanner no pelee
        double distanciaSol = 0;
        
        enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO} //explicar
        tipoPlaneta tipo;
        
        // Atributo que define si el planeta es observable o no
        boolean esObservable = false;
        double densidad = 0;
        boolean exterior = false;

        Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaSol, tipoPlaneta tipo, boolean esObservable) {
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaSol = distanciaSol;
            this.tipo = tipo;
            this.esObservable = esObservable;
        }
    
        public double calcularDensidad () {
            double densidad = masa/ volumen;
            return densidad;
        }
    
        boolean esPlanetaExterior(){
            float limite = (float) (149597870 * 3.4);
            /* Un planeta exterior está situado más allá del cinturón deasteroides */
            /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =149.597.870 Km) */
            if (distanciaSol > limite) {
                return true;
            } else {
                return false;
            }
        }
        
        void imprimir() {
            System.out.println("Nombre del planeta = " + nombre);
            System.out.println("Cantidad de satelites = " + cantidadSatelites);
            System.out.println("Masa del planeta = "  + masa);
            System.out.println("Volumen del planeta = " + volumen);
            System.out.println("Diametro del planeta = " + diametro);
            System.out.println("Distancia al sol = " + distanciaSol);
            System.out.println("Tipo de planeta = " + tipo);
            System.out.println("Es observable = " + esObservable);
            System.out.println("Densidad del planeta = " + calcularDensidad());
            System.out.println("Es planeta exterior = " + esPlanetaExterior());
        }
    } 

    public static void main(String args[]) {
            
        Scanner entrada_teclado = new Scanner(System.in); //para recibir cosas del teclado
            
        System.out.println("INGRESE LOS DATOS DEL PLANETA 1");//aviso
        System.out.println("Ingrese el Nombre del Planeta:"); // pedimos al usuario
        String nombre = entrada_teclado.nextLine();
            
        System.out.println("Ingrese la cantidad de satelites:"); // pedimos al usuario
        int cantidadSatelites = entrada_teclado.nextInt();
            
        System.out.println("Ingrese La Masa del Planeta:"); // pedimos al usuario
        double masa = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el Volumen del Planeta:"); // pedimos al usuario
        double volumen = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el diametro del Planeta:"); // pedimos al usuario
        double diametro = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese la Distancia al sol del Planeta:"); // pedimos al usuario
        double distanciaSol = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el tipo de planeta (GASEOSO, TERRESTRE o ENANO):"); 
        String textoTipo = entrada_teclado.next().toUpperCase();
        Planeta.tipoPlaneta tipo = Planeta.tipoPlaneta.valueOf(textoTipo);
            
        System.out.println("El planeta es observable? (escriba true o false):"); 
        boolean esObservable = entrada_teclado.nextBoolean();
            
        // con nextInt(), Guarda lo q el usuario digita en que se le puso
        // la tecla "Enter" guardada en la memoria del teclado.
        // el próximo nextLine() borra el "Enter" salta, limpia el teclado.
        entrada_teclado.nextLine(); 
            
        //Crea a al planeta1 usando el molde
        Planeta p1 = new Planeta(nombre, cantidadSatelites, masa, volumen, diametro, distanciaSol, tipo, esObservable);
            
        System.out.println("\nINGRESE LOS DATOS DEL PLANETA 2");//aviso
        System.out.println("Ingrese el Nombre del Planeta 2:"); // pedimos al usuario
        String nombre2 = entrada_teclado.nextLine();
            
        System.out.println("Ingrese la cantidad de satelites:"); // pedimos al usuario
        int cantidadSatelites2 = entrada_teclado.nextInt();
            
        System.out.println("Ingrese La Masa del Planeta:"); // pedimos al usuario
        double masa2 = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el Volumen del Planeta:"); // pedimos al usuario
        double volumen2 = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el Diametro del Planeta:"); // pedimos al usuario
        double diametro2 = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese la Distancia al sol del Planeta:"); // pedimos al usuario
        double distanciaSol2 = entrada_teclado.nextDouble();
            
        System.out.println("Ingrese el tipo de planeta (GASEOSO, TERRESTRE o ENANO):"); 
        String textoTipo2 = entrada_teclado.next().toUpperCase();
        Planeta.tipoPlaneta tipo2 = Planeta.tipoPlaneta.valueOf(textoTipo2);
            
        System.out.println("El planeta es observable? (escriba true o false):"); 
        boolean esObservable2 = entrada_teclado.nextBoolean();
            
        // con nextInt(), Guarda lo q el usuario digita en que se le puso
        // la tecla "Enter" guardada en la memoria del teclado.
        // el próximo nextLine() borra el "Enter" salta, limpia el teclado.
        entrada_teclado.nextLine(); 
            
        // Usamos EXACTAMENTE el mismo molde (la clase Planeta) para construir 
        // un segundo objeto totalmente independiente llamado 'p2'. Lo que le 
        // pase a p2 no afecta a p1.
        Planeta p2 = new Planeta(nombre2, cantidadSatelites2, masa2, volumen2, diametro2, distanciaSol2, tipo2, esObservable2);

        //Final
        System.out.println("\nRESULTADOS");
        System.out.println("--- Datos Planeta 1 ---");
        p1.imprimir(); // Imprime a el 1 (usando los datos guardados en p1)

        System.out.println("\n--- Datos Planeta 2 ---");
        p2.imprimir(); // Imprime a la segunda (usando los datos guardados en p2)
        
        entrada_teclado.close();
    }
}