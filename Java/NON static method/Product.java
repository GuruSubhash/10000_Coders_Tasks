
public class Product {
    String productName;
    int productId;
    double productPrice;
    void addProductDetails(String prodName, int prodId, double prodPrice){
        productName=prodName;
        productId=prodId;
        productPrice=prodPrice;
    }
    String displayDetails(){
        return "Product Name : "+productName+"\nProduct Id : "+productId+ "\nProduct Price : "+productPrice;
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.addProductDetails("santoor",666,248.07637434673);
        System.out.println(p.displayDetails());
    }
}
