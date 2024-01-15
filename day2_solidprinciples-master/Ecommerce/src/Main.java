import Entity.Product;
import Service.service;
import ServiceImp.Order;

public class Main {
    public static void main(String[] args) {

        Product product=new Product("Laptop",99);
        Product product2=new Product("Laptop",99);

        service service= new Order();
        service.addProduct(product);
        service.addProduct(product2);
        service.checkout();
    }
}