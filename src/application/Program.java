package application;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import entities.Product;
import util.ProductPredicate;

public class Program {

    public static void main(final String[] args) {

        final List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //5ºforma de fazer ta aqui
        double min = 100;
        Predicate<Product> pred = p -> p.getPrice() >= min;

        System.out.println("After:");
        list.forEach(System.out::println);

        //jeito q faziamos mas nao entendiamos o motivo
        //1º forma de fazer
        //list.removeIf(p -> p.getPrice() >= 100);

        //ela é uma interface funcional pq so tem um metodo a ser aplicado
        //2º forma de fazer
        //list.removeIf(new ProductPredicate());

        //3º forma de fazer
        //list.removeIf(Product::staticProductPredicate);

        //4º forma de fazer
        //list.removeIf(Product::nonStaticProductPredicate);

        //5º forma de fazer
        list.removeIf(pred);

        System.out.println("\nBefore:");

        list.forEach(System.out::println);
    }
}