import java.util.ArrayList;

public class Customer {
    
    private int Id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private ArrayList<Rental> rentals;

    public Customer(int id, String name, String email,String phone, String address) {
        this.Id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rentals = new ArrayList<Rental>();
    }

    
}
