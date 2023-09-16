package OnlineStore;


public class Main {
    
    public static void main(String[] args){
        try{
            Products hamburguer = new Requests("Hamburguer", 2, 10);
            Products pizza = new Requests("pizza", 1, 10);
            Products lunch = new Requests("lunch", 2, 10);
            Products breakfast = new Requests("breakfast", 1, 10);
            Products taco = new Requests("taco", 2, 10);
        
            ProductsList list = new ProductsList();
        
            list.addRequest((Requests) hamburguer);
            list.addRequest((Requests) pizza);
            list.addRequest((Requests) lunch);
            list.addRequest((Requests) breakfast);
            list.addRequest((Requests) taco);
        
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("   >>>      Requests      <<<");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            list.listProducts();
            
            list.removeRequest((Requests) pizza);
            list.removeRequest((Requests) lunch);
            
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println(" >>>      Requests Update     <<<");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            list.listProducts();
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println();
            System.out.println("Thanks for your request!");
        }
        
    }
}
