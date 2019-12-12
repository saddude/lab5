package lab5;

public class tarelo4ka extends Dish {
    private String razmer;
    public String getRazmer() {
        return razmer;
    }
    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }
    public tarelo4ka(String material, String color, String razmer) {
        super(material, color);
        this.razmer = razmer;
    }
    @Override
    public String toString() {
        return "Тарелка {" +
                "Размер: " + razmer +
                ", Материал: " + material +
                ", Цвет: " + color +
                '}';
    }
}