public class SpecificProduct extends Product {

    private String category;
    private String marca;

    public SpecificProduct(int id, String name, double price, String category, String marca) {
        super(id, name, price);
        this.category = category;
        this.marca = marca;
    }

    public SpecificProduct() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SpecificProduct{" +
                "category='" + category + '\'' +
                ", marca='" + marca + '\n';
    }
}
