import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMonedas consulta = new ConsultaMonedas();
        int opcion = 0;
        while (opcion != 7) {

            System.out.println("---------------------------------");
            System.out.println("APLICACION CONVERSORA DE DIVISAS");
            System.out.println("---------------------------------");
            System.out.println("INGRESE UNA DIVISA A CONVERTIR");
            System.out.println("-------------------------------");
            System.out.println("1. Dollar a peso Chileno");
            System.out.println("2. Peso Chileno a Dollar");
            System.out.println("3. Dollar a Euro");
            System.out.println("4. Euro a Dollar");
            System.out.println("5. Dollar a Peso Argentino");
            System.out.println("6. Peso Argentino a Dollar");
            System.out.println("7. Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConversorMonedas.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 2:
                    ConversorMonedas.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConversorMonedas.convertir("USD", "EUR", consulta, lectura);
                    break;
                case 4:
                    ConversorMonedas.convertir("EUR", "USD", consulta, lectura);
                    break;
                case 5:
                    ConversorMonedas.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 6:
                    ConversorMonedas.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("FIN DEL PROGRAMA, HASTA LUEGO");
                    break;
                default: System.out.println("OPCION NO VALIDA");
                    System.out.println("---------------------");
                    System.out.println("INGRESE OPCION 1 A LA 6");
                    System.out.println("-----------------------");
                    System.out.println("SI DESEA SALIR OPCION 7");
                break; }

        }
        lectura.close();
    }}

