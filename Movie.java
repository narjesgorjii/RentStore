import java.util.Date;

public class Movie extends Item {

    private String Director;
    private String Cast;

    public Movie(int id, String title, String genre, Date releaseDate, String director, String cast, double price) {
        
        super(id,title,genre,releaseDate,price);
        this.Cast = cast;
        this.Director = director;    
    }


    // Getter 

    public String GetDirector(){
        return this.Director;
    }

    public String GetCast(){
        return this.Cast;
    }



    @Override
    public String toString() {

        return super.toString() + " - " + this.Director + " - " + this.Cast;
    }
}
