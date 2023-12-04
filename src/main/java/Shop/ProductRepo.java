package Shop;

import java.util.ArrayList;
public class ProductRepo {

    ArrayList<Product> productsList = new ArrayList<Product>();
    public ProductRepo(){  //Konstruktor
        productsList.add(new Product("Carnegiea gigantea",402789346,233,true));
        productsList.add(new Product("Bread",42364532,1.99,true));
        productsList.add(new Product("Candle", 3242535, 4, true));


        System.out.println(productsList);

    }


    public Product addProduct(Product product) {
        productsList.add(product);
        return product;
    }

    public void removeProduct(Product product){
        productsList.remove(product);
    }

    public Product findProductByProductNumber(int productNumber){
        for(Product product:productsList){
            if (productNumber == product.productNumber()){
                return product;
            }
        }
        throw new RuntimeException("Product with product number " + productNumber + " not found.:P" );
    }
}

