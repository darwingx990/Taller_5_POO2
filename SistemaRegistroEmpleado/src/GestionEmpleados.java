import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    private ArrayList<Empleado> tempEmployeeList;
    private ArrayList<Empleado> permanentEmployList;
    private ArrayList<Empleado> employeeList;

    Scanner objScan = new Scanner(System.in);

    public GestionEmpleados(ArrayList<Empleado> tempEmployeeList, ArrayList<Empleado> permanentEmployList, ArrayList<Empleado> employeeList) {
        this.tempEmployeeList = tempEmployeeList;
        this.permanentEmployList = permanentEmployList;
        this.employeeList = employeeList;
    }

    public GestionEmpleados() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee() {
        Empleado empleado = new Empleado();
        employeeList = new ArrayList<>();

        int idEmpleado = employeeList.indexOf(empleado) + 2;

        System.out.println("Ingrese el nombre del empleado: ");
        String name = objScan.nextLine();

        System.out.println("Ingrese la edad del empleado: ");
        int age = objScan.nextInt();

        System.out.println("Ingrese el salario del empleado: ");
        double salario = objScan.nextDouble();

//        System.out.println("""
//                Ingrese el tipo de empleado:
//                1.  Empleado Permanente
//                2. Empleado Temporal:
//                """);
//        int opTypeEmployee = objScan.nextInt();
//
//        if (opTypeEmployee == 1) {
//            String typeEmployee = "Temporal";
//            employeeList.add(empleado);
//            tempEmployeeList.add(empleado);
//
//        }

    }

    public void showList() {
        String employees = "";

        if (this.employeeList.isEmpty()) {
            System.out.println("Lista vacia");
            return;
        } else {

            for (Empleado empleado : this.employeeList) {
                employees += empleado.toString();
            }
            System.out.println(employees);
        }
    }

    public void deleteEmployee() {
        int opDelete = objScan.nextInt();
        this.employeeList.removeIf(empleado -> empleado.getIdEmpleado() == opDelete);
        System.out.println("Producto eliminado con exito.");
    }

}
