class CartItem {
    int itemId;
    String itemName;
    double [] pricesFromSellers;

    public CartItem(int itemId, String name, double[] arr){
        this.itemId=itemId;
        itemName=name;
        pricesFromSellers=arr;
    }
    
}
