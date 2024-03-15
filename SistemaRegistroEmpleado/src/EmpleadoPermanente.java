import java.util.ArrayList;

public class EmpleadoPermanente extends Empleado {
    boolean isPermanent;

    public EmpleadoPermanente(String name, int age, int idEmpleado, double salario, boolean isPermanent) {
        super(name, age, idEmpleado, salario);
        this.isPermanent = isPermanent;
    }

    public EmpleadoPermanente(String name, int age, int idEmpleado, double salario) {
        super(name, age, idEmpleado, salario);
    }

    public EmpleadoPermanente() {
    }
}
