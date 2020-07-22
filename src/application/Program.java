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

        double min = 100;
        //5ºforma de fazer ta aqui - EXPRESSÃO LAMBDA DECLARADA
        //Predicate<Product> pred = p -> p.getPrice() >= min;

        System.out.println("After:");
        list.forEach(System.out::println);

        

        //ela é uma interface funcional pq so tem um metodo a ser aplicado
        //1ª forma de fazer - PREDICATE IMPLEMENTION
        //list.removeIf(new ProductPredicate());

        //2ª forma de fazer - REFERENCE METHOD COM MÉTODO ESTATICO
        //list.removeIf(Product::staticProductPredicate);

        //3ª forma de fazer - REFERENCE METHOD COM MÉTODO NÃO ESTATICO
        //list.removeIf(Product::nonStaticProductPredicate);

        //4ª forma de fazer - EXPRESSÃO LAMBDA DECLARADA
        //list.removeIf(pred);

        //jeito q faziamos mas nao entendiamos o motivo
        //5ª forma de fazer - EXPRESSÃO LAMBDA INLINE(em vez de declarar ja passa os dados na função)
        list.removeIf(p -> p.getPrice() >= min);

        System.out.println("\nBefore:");

        list.forEach(System.out::println);
    }
}