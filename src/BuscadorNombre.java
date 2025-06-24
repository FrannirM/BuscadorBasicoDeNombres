import java.util.Scanner;

public class BuscadorNombre {
//---------------FUNCION MAIN---------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Buscador de nombres");

        //Defino Scanner
        var consola = new Scanner(System.in);

        //Pido largo del arreglo
        System.out.print("Indique cuantos nombres quiere cargar: ");
        var cantidadArreglo = Integer.parseInt(consola.nextLine());
        var arregloNombres = new String[cantidadArreglo];

        //Cargo datos al arreglo
        for (var i =0; i<cantidadArreglo; i++) {
            System.out.print("Introduzca un nombre: ");
            arregloNombres[i] = consola.nextLine();
        }

        //Control de bucle
        var controlBucle = false;

        //Menu
        while (!controlBucle) {
            System.out.println();
            System.out.println("Bienvenido al buscador de nombres");
            System.out.println();
            System.out.println("""
                    1. Buscar nombres
                    2. Ver todos los nombres guardados
                    3. Salir
                    
                    """);

            var opcion = consola.nextInt();
            if (opcion == 1) {
                mostrarNombres(arregloNombres);
            } else if (opcion == 2) {
                for (var i = 0; i<arregloNombres.length; i++) {
                    System.out.println("Valor del indice: " + i + " " + arregloNombres[i]);
                }
            } else if (opcion == 3) {
                System.out.println("HASTA LUEGO!");
                controlBucle = true;
            } else System.out.println("ERROR, VUELVA A INTENTAR!");
        }
    }

    //---------------FUNCION BUSCAR NOMBRES---------------------------------------------------------------------------------------------
    public static void mostrarNombres(String arreglo[]) {
        //Defino Scanner
        var consola2 = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("* BIENVENIDO AL BUSCADOR DE NOMBRES *");
        System.out.println("***************************************");


        System.out.print("Indique nombre y veamos si esta anotado: ");
        var nombreABuscar = consola2.nextLine();

        for (var i = 0; i < arreglo.length; i++) {
            if (nombreABuscar.equals(arreglo[i])) {
                System.out.println("Intento numero: " + i + " Se encontro el nombre " + "*** "+arreglo[i]+" ***");
            } else System.out.println("Intento numero: " + i + " No se encontro el nombre " + nombreABuscar);;
        }

    //---------------FUNCION BUSCAR NOMBRES---------------------------------------------------------------------------------------------
    }
}