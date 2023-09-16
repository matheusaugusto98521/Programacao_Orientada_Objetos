package OnlineStore;


public abstract class Products {
    private String product;
    private int amount;
    private double price;
    
    public Products(String product, int amount, double price){
        
        this.product = product;
        this.amount = amount;
        this.price = price;
    }
    
   
    public abstract void displayProducts();

    public String getProduct() {
        return product;
    }
    

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
