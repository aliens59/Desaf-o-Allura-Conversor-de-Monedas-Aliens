import java.util.Scanner;

public class ConversorMonedas {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaMonedas consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion equivale a:\n1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la Cantidad de " + monedaBase);
        System.out.println("-------------------------------");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.printf("%s %s = %.2f %s%n", cantidad, monedaBase, cantidadConvertida, monedas.target_code());
    }}