package OnlineStore;



public class Requests extends Products{
    
    public Requests(String product, int amount, double price){
        super(product, amount, price);
        
        if((product == null || product.isBlank()) && amount <= 0){
            throw new RuntimeException(">>> INVALID PRODUCT <<<");
        }
    }

    
    public double calculateAccount(){
        double res = 0;
        double price = getPrice();
        int amount = getAmount();
        if(amount > 1){
            res += price * amount;
        }
        else{
            res += price;
        }
    
                return res;
}
    
    @Override
    public void displayProducts(){
        System.out.println();
        System.out.println(">>>      Product: " + getProduct());
        System.out.println(">>>      Amount: " + getAmount());
        System.out.println(">>>      Price U$ " + getPrice());
        
    }
    
    
    
    
}
