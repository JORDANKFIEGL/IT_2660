public class Customer {
    private String name;


    public Customer(String name){
        this.name = name;
    }

    public Customer(){
        this.name = "Private Customer";
    }

    public String getName(Customer customer){
        return customer.name;
    }

    public String getName() {
        return name;
    }
}
