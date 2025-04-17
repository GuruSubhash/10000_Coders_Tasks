
public class ShoppingCart {

    CartItem ci_s[];
    
    public ShoppingCart(CartItem[] crt_i_s) {this.ci_s=crt_i_s;}

    public double getLowetPrice(double[] ci){
        double low_price=Double.MAX_VALUE;
        for(int i=0; i<ci.length;++i) if(low_price>ci[i]) low_price=ci[i];
        return low_price;
    }

    void displayCart(){
        System.out.println("------------------------------------------------------------");
        for(int i=0; i<ci_s.length;++i)
        System.out.println("\nItem id : "+ ci_s[i].itemId+"\nItem name : "+ci_s[i].itemName+"\nPrice : "+ getLowetPrice(ci_s[i].pricesFromSellers));
    }
    double calculateTotalCost(){
        double sum=0;
        for(int i=0; i<ci_s.length; ++i) sum+=getLowetPrice(ci_s[i].pricesFromSellers);
        return sum;
    }

    public static void main(String[] args) {
        CartItem ci1= new CartItem(36,"t-shirt",new double[]{299,399,499});
        CartItem ci2= new CartItem(36,"Pant",new double[]{299,399,499});
        CartItem ci3= new CartItem(36,"Hoodie",new double[]{299,399,499});
        CartItem ci4= new CartItem(36,"shirt",new double[]{299,399,499});
        CartItem ci5= new CartItem(36,"Wite shirt",new double[]{299,399,499});

        CartItem[] ci_s=new CartItem[]{ci1,ci2,ci3,ci4,ci5};

        ShoppingCart sc= new ShoppingCart(ci_s);
        for(int i=0; i<ci_s.length;++i) sc.displayCart();
        System.out.println("total cost of above items is : "+ sc.calculateTotalCost());
    }
}
