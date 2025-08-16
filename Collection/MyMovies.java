package Collection;

import java.util.*;
public class MyMovies {
    public static void main(String[] args) {
        List<String>movies = new ArrayList<String>();
        movies.add("Avengers: The Infinity war");
        movies.add("Avengers: The Endgame");
        movies.add("Spider-man: No way Home");
        movies.add("Love and Thunder");

        for(String movie : movies){
            System.out.println(movie);
        }
    }
}
