import java.util.ArrayList;

public class RentalStore {
    
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;


    public void Register(Customer customer){

    }


    public void AddItem(Item item){

    }

    public void RemoveItem(Item item){

    }

    public ArrayList<Item> GetAvaibleItem(){
        
        ArrayList<Item> avaibleItems = new ArrayList<Item>();

        for (Item item : items) {
            
            if(item.IsAvaible()){
                avaibleItems.add(item);
            }
        }

        return avaibleItems;
    }
}
