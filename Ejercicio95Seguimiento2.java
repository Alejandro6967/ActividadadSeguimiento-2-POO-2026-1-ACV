package Seguimiento2;
import java.util.Scanner; // Importamos para pedir datos

public class Ejercicio95Seguimiento2 {

    static class CuentaBancaria {

        // nombres titular cuenta 
        String nombresTitular;
        String apellidosTitular;
        int numeroCuenta;
        enum tipo { AHORROS, CORRIENTE }
        tipo tipoCuenta;
        float saldo = 0;

        CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
            this.nombresTitular = nombresTitular;
            this.apellidosTitular = apellidosTitular;
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
        }

        void imprimir() {
            System.out.println("Nombres del titular = " + nombresTitular);
            System.out.println("Apellidos del titular = " + apellidosTitular);
            System.out.println("Número de cuenta = " + numeroCuenta);
            System.out.println("Tipo de cuenta = " + tipoCuenta);
            System.out.println("Saldo = " + saldo);
        }

        void consultarSaldo() {
            System.out.println("El saldo actual es = " + saldo);
        }

        boolean consignar(int valor) {
            if (valor > 0) {
                saldo = saldo + valor;
                System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
                return true;
            } else {
                System.out.println("El valor a consignar debe ser mayor que cero.");
                return false;
            }
        }

        boolean retirar(int valor) {
            if ((valor > 0) && (valor <= saldo)) {
                saldo = saldo - valor;
                System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
                return true;
            } else {
                System.out.println("El valor a retirar debe ser menor que el saldo actual.");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombres del titular: ");
        String nombres = entrada.nextLine();

        System.out.print("Ingrese apellidos del titular: ");
        String apellidos = entrada.nextLine();

        System.out.print("Ingrese número de cuenta: ");
        int numero = entrada.nextInt();

        System.out.print("Tipo de cuenta (AHORROS / CORRIENTE): ");
        String tipoTxt = entrada.next().toUpperCase();
        CuentaBancaria.tipo tipoCuenta = CuentaBancaria.tipo.valueOf(tipoTxt);

        CuentaBancaria cuenta = new CuentaBancaria(nombres, apellidos, numero, tipoCuenta);
        cuenta.imprimir();

        System.out.print("Ingrese valor a consignar: ");
        int valorC1 = entrada.nextInt();
        cuenta.consignar(valorC1);

        System.out.print("Ingrese otro valor a consignar: ");
        int valorC2 = entrada.nextInt();
        cuenta.consignar(valorC2);

        System.out.print("Ingrese valor a retirar: ");
        int valorR = entrada.nextInt();
        cuenta.retirar(valorR);
        entrada.close();
    }
}