import java.util.ArrayList;

public class EmpleadoTemporal extends Empleado {

    boolean isTemp;

    public EmpleadoTemporal(String name, int age, int idEmpleado, double salario) {
        super(name, age, idEmpleado, salario);
    }

    public EmpleadoTemporal(String name, int age, int idEmpleado, double salario, boolean isTemp) {
        super(name, age, idEmpleado, salario);
        this.isTemp = isTemp;
    }

    public EmpleadoTemporal() {
    }
}