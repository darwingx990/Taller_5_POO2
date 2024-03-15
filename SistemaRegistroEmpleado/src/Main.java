import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado objEmpleado = new Empleado();
        GestionEmpleados objGestion = new GestionEmpleados();
        Scanner objScan = new Scanner(System.in);
        int option;

        do {

            System.out.println("""
                    ===============================
                    SISTEMA DE CONTROL DE VERSIONES
                    ===============================
                    1. Añadir empleado
                    2. Mostrar empleado
                    3. Eliminar empleado
                    4. Salir
                                        
                    Selecciona una opción:""");
            option = objScan.nextInt();
            switch (option) {
                case 1:
                    objGestion.addEmployee();
                    break;

                case 2:
                    objGestion.showList();
                    break;

                case 3:
                    objGestion.deleteEmployee();

                    break;

                default:
                    System.out.println("Opcion no valida. Intentelo nuevamente.");
                    break;
            }
        } while (option == 4);
        {
            System.out.println("Gracias por usar nuestra plataforma. Hasta luego ");
        }
        ;


//        Inventary objInventary = new Inventary();
//        objInventary.addProduct();

    }
}