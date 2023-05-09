  
}package Entidades;

public class CuentaBancaria {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
package Servicios;

import Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {

    private static final Scanner scanner = new Scanner(System.in);

    public static CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();

        System.out.println("Ingrese el saldo actual: ");
        double saldoActual = scanner.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public static void ingresar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Se han ingresado " + cantidad + " euros a la cuenta.");
    }

    public static void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad > saldoActual) {
            cantidad = saldoActual;
        }
        saldoActual -= cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Se han retirado " + cantidad + " euros de la cuenta.");
    }

    public static void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double limite = saldoActual * 0.2;
        System.out.println("¿Cuánto dinero desea retirar? (máximo " + limite + " euros)");
        double cantidad = scanner.nextDouble();
        if (cantidad > limite) {
            cantidad = limite;
        }
        saldoActual -= cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Se han retirado " + cantidad + " euros de la cuenta.");
    }

    public static void consultarSaldo(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("El saldo actual de la cuenta es de " + saldoActual + " euros.");
    }

    public static void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getD


Swith  