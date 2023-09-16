package Automobile;


public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    
    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        
        
        
    }
  
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if((brand == null || brand.isEmpty())){
            System.out.println("ILLEGAL ARGUMENT >>> Brand and model cannot be null or blank <<<");
        }
        else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        if((model == null || model.isEmpty())){
            System.out.println("ILLEGAL ARGUMENT >>> Brand and model cannot be null or blank <<<");
        }
        else{
            this.model = brand;
        }
          
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
