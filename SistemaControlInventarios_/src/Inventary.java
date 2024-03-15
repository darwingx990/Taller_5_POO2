import javax.swing.*;
import java.util.ArrayList;

public class Inventary {

    private ArrayList<SpecificProduct> inventaryList;
//    private SpecificProduct product = new SpecificProduct();


    public Inventary() {
        this.inventaryList = new ArrayList<>();
    }

    public void addProduct() {

        int idProduct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto: "));
        String nameProduct = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        double priceProduct = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        String category = JOptionPane.showInputDialog("Ingrese la categoria del producto: ");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del producto: ");

        SpecificProduct product1 = new SpecificProduct(idProduct, nameProduct, priceProduct, category, marca);
        System.out.println(product1.toString());
        inventaryList.add(product1);
        JOptionPane.showMessageDialog(null, "Propducto agregado correctamente.");
    }

    public void showProducts() {
        String products = "";
//        System.out.println(this.inventaryList.get(0));

        if (this.inventaryList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        } else {

            for (SpecificProduct product : this.inventaryList) {
                products += product.toString();
            }
            JOptionPane.showMessageDialog(null, products);

            //}
        }
    }

    public void deleteProduct() {
        this.showProducts();
        if (!inventaryList.isEmpty()) {
            int optionDelete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del producto a eliminar: "));
            this.inventaryList.removeIf(product1 -> product1.getId() == optionDelete);
            JOptionPane.showMessageDialog(null, "Producto eliminado con exito.");
            System.out.println(inventaryList);
        }

//        String opDelete = JOptionPane.showInputDialog("Selecciona ID del producto a eliminar:");
    }

}
