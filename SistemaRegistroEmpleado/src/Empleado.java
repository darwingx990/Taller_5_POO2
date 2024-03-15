public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;

    public Empleado(String name, int age, int idEmpleado, double salario) {
        super(name, age);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                '}';
    }
}
