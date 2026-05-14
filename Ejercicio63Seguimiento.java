package Seguimiento2;
import java.util.Scanner; // Importamos para pedir datos

class Persona {
    String Nombre; // Atributo que identifica el nombre de una persona
    String Apellido; // Atributo que identifica los apellidos de una persona
    String NumeroDocumento; //son lo atributos
    int AnioNacimiento;
        
    Persona(String Nombre, String Apellido, String NumeroDocumento, int AnioNacimiento) {
        // EXPLICACIÓN DE 'this':
        // La palabra 'this' funciona como una referencia al objeto actual.
        // Como el parámetro se llama "Nombre" y el atributo de arriba también se llama "Nombre",
        // usamos 'this.Nombre' para decirle a Java: "Oye, guarda el dato en el atributo de la CLASE,
        // no te confundas con la variable que acaba de entrar en el paréntesis".
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroDocumento = NumeroDocumento;
        this.AnioNacimiento = AnioNacimiento;
    }
    
    void imprimir(){ // aqui es texto + la variable de texto
        System.out.println("Nombre = " + Nombre);
        System.out.println("Apellido = " + Apellido);
        System.out.println("Numero de documento de identidad = " + NumeroDocumento);
        System.out.println("Fecha de nacimiento = " + AnioNacimiento);
        System.out.println();
    }
}

public class Ejercicio63Seguimiento {
    
    public static void main(String[] args) {
            Scanner entrada_teclado = new Scanner(System.in); //para recibir cosas del teclado
            
            System.out.println("INGRESE LOS DATOS DE LA PERSONA 1");//aviso
            System.out.println("Ingrese el Nombre:"); // pedimos al usuario
            String Nombre = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Apellido:"); // pedimos al usuario
            String Apellido = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Numero de Documento:"); // pedimos al usuario
            String NumeroDocumento = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Fecha de Nacimiento:"); // pedimos al usuario
            int AnioNacimiento = entrada_teclado.nextInt();
            
            // EXPLICACIÓN DEL TRUCO DEL SCANNER:
            // Cuando leemos un número con nextInt(), Java lee el número (ej. 20) pero deja 
            // la tecla "Enter" guardada en la memoria del teclado. Si no ponemos esta línea 
            // vacía, el próximo nextLine() se traga ese "Enter" y se salta la pregunta.
            // Esto actúa como una "escoba" que limpia el teclado.
            entrada_teclado.nextLine();
            
            //Crear a la persona usando el molde
            Persona p1 = new Persona(Nombre, Apellido, NumeroDocumento, AnioNacimiento);
        
            System.out.println("\nINGRESE LOS DATOS DE LA PERSONA 2");
            
            System.out.println("Ingrese el Nombre:"); 
            String Nombre2 = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Apellido:"); 
            String Apellido2 = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Numero de Documento:"); 
            String NumeroDocumento2 = entrada_teclado.nextLine();
            
            System.out.println("Ingrese el Año de Nacimiento:"); 
            int AnioNacimiento2 = entrada_teclado.nextInt();

            // EXPLICACIÓN DE CREAR DOS PERSONAS:
            // Aquí demostramos el poder de la Programación Orientada a Objetos.
            // Usamos EXACTAMENTE el mismo molde (la clase Persona) para construir 
            // un segundo objeto totalmente independiente llamado 'p2'. Lo que le 
            // pase a p2 no afecta a p1.
            Persona p2 = new Persona(Nombre2, Apellido2, NumeroDocumento2, AnioNacimiento2);

            //Final
            System.out.println("\nRESULTADOS");
            System.out.println("Datos Persona 1");
            p1.imprimir(); // Imprime a la primera (usando los datos guardados en p1)

            System.out.println("Datos Persona 2");
            p2.imprimir(); // Imprime a la segunda (usando los datos guardados en p2)
    }
}