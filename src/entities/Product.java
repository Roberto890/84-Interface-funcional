package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //statico usa o produto que eu passar
    //3º forma de fazer - REFERENCE METHOD COM MÉTODO ESTATICO
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.00;
    }

    //não estatico usa o proprio produto
    //4º forma de fazer - REFERENCE METHOD COM MÉTODO NÃO ESTATICO
    public boolean nonStaticProductPredicate(){
        return price >= 100.00;
    }

    @Override
    public String toString() {
        return "Product [name = "+getName()+", " + "price = " + getPrice() + "]";
    }

    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }

}