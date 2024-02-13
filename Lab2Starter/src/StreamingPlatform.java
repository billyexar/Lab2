import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform {
    private List<Movie> aEntertainmentList;

    public StreamingPlatform(){
        aEntertainmentList = new ArrayList<>();
    }

    public void addEntertainmentToPlatform(Movie pEntertainment){
        assert pEntertainment != null;
        aEntertainmentList.add(pEntertainment);
    }

    public void removeEntertainmentFromPlatform(Movie pEntertainment){
        assert pEntertainment != null;
        if (aEntertainmentList.contains(pEntertainment)) {
            aEntertainmentList.remove(pEntertainment);
        }
    }


}
