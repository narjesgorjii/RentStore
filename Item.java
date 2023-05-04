import java.util.Date;

public class Item{

    protected int Id;
    protected String Title;
    protected String Genre;
    protected Date ReleaseDate;
    protected boolean isAvaible;
    protected double price;

    public Item(int id, String title, String genre, Date releaseDate,double price) {
        
        this.Id = id;
        this.Title = title;
        this.Genre = genre;
        this.ReleaseDate = releaseDate;
        this.isAvaible = true;
        this.price = price;
    }


    // Getter

    public int GetId(){
        return this.Id;
    }

    public String GetTitle(){
        return this.Title;
    }

    public String GetGenre(){
        return this.Genre;
    }

    public Date GetReleaseDate(){
        return this.ReleaseDate;
    }

    public boolean IsAvaible(){
        return this.isAvaible;
    }

    // Setter

    public void SetAvaible(boolean status){
        this.isAvaible = status;
    }


    @Override
    public String toString() {
        
        return this.Id + " - " + this.Title + " - " + this.Genre + " - " + ReleaseDate.toString();        
    }
}