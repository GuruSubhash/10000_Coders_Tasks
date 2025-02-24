
public class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    void setProductId(int prodId){
        productId=prodId;
    }
    void setProductName(String prodName){
        productName=prodName;
    }
    void setPrice(double price){
        this.price=price;
    }
    void setQuantity(int quant){
        quantity=quant;
    }
    int getProductId(){
        return productId;
    }
    String getProductName(){
        return productName;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }

}
