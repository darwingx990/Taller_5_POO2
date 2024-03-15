import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Inventary objInventary = new Inventary();
        String option;
        
        do {

            option = JOptionPane.showInputDialog("""
                    ===============================
                    SISTEMA DE CONTROL DE VERSIONES
                    ===============================
                    1. Añadir producto
                    2. Mostrar producto
                    3. Eliminar producto
                    4. Salir
                                        
                    Selecciona una opción:""");
            switch (option) {
                case "1":
                    objInventary.addProduct();
                    break;

                case "2":
                    objInventary.showProducts();
                    break;

                case "3":

                    objInventary.deleteProduct();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Intentelo nuevamente.");
                    break;
            }
        } while (!option.equals("4"));{JOptionPane.showMessageDialog(null, "Gracias por usar nuestra plataforma. Hasta luego ");};


//        Inventary objInventary = new Inventary();
//        objInventary.addProduct();

    }
}