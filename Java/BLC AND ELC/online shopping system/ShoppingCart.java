public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.productId);
        p1.setProductId(666);
        p1.setProductName("Santoor");
        p1.setPrice(666.666666666666);
        p1.setQuantity(100);
        System.out.println(p1.getProductId());
        System.out.println(p1.getProductName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getQuantity());
        
    }
}
