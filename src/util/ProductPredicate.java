package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

    @Override
    //IMPLEMENTA O TESTE QUE ESTAVAMOS FAZENDO LA NO PROGRAM
    public boolean test(Product p) {
        return p.getPrice() >= 100.00;
    }
    
}