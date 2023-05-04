import java.util.Date;

public class Rental {
    
    
    private int Id;
    private Item item;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Rental(int id, Item item, Customer customer) {
        
        this.Id = id;
        this.item = item;
        this.customer = customer;
        rentalDate = new Date();
    }

    //Getter

    public int GetId(){
        return this.Id;
    }

    public Item GetItem(){
        return this.item;
    }

    public Customer GetCustomer(){
        return this.customer;
    }

    public Date GetRentalDate(){
        return this.rentalDate;
    }

    public Date GetReturnDate(){
        return this.returnDate;
    }

    //Setter

    public void SetReturnDate(Date date){
        this.returnDate = date;
    }


    // Methods

    public double CalculateLateFee(){
        
        return 0;
    }

}
