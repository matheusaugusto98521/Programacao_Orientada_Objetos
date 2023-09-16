package OnlineStore;
import java.util.List;
import java.util.ArrayList;

public class ProductsList{
    private List<Requests> products;
    public ProductsList(){
        products = new ArrayList();
    }
    
    
    public void addRequest(Requests prod){
        products.add(prod);
    }
    
    public void removeRequest(Requests prod){
        products.remove(prod);
    }

    public List<Requests> getProducts() {
        return products;
    }

    public void setProducts(List<Requests> products) {
        this.products = products;
    }
    
    
    public void listProducts(){
        double res = 0;
        for(Requests product : products){
            product.displayProducts();
            res += product.calculateAccount();
            
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(">>>      Total U$ " + res);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
        
    
}
