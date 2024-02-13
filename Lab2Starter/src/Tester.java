public class Tester {

    public static void main(String[] args) {

        StreamingPlatform Netflix = new StreamingPlatform();

        Movie Prisoners = new Movie("Denis Villeneuve", 153, Genre.Thriller);
        Movie MeanGirls = new Movie("Mark Waters", 97, Genre.Comedy);
        Movie Sicario = new Movie("Denis Villeneuve", 121, Genre.Action);

        Netflix.addEntertainmentToPlatform(Prisoners);
        Netflix.addEntertainmentToPlatform(MeanGirls);
        Netflix.addEntertainmentToPlatform(Sicario);


    }
}
