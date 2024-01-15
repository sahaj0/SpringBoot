package ServiceImp;
import Entity.Product;
import Service.service;
import java.util.ArrayList;
import java.util.List;

public class Order implements service {
    //Adding product into list
    private List<Product> products=new ArrayList<>();
    private  double totalAmount;

    @Override
    public Product addProduct(Product product){
        products.add(product);
       for(int i=0;i<products.size();i++){
           System.out.println("Your  Product Added Successfully ");
       }
        totalAmount +=product.getPrice();
        System.out.println("Your Total Amount:"+totalAmount);
        return product;
    }

    @Override
    public void checkout() {
         System.out.println("Your Order is process successfully");

    }


}
