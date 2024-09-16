package test;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovie = new movie();


        movieItem item1 = new movieItem("harry potter", "mathew");
        movieItem item2 = new movieItem("the end of earth", "Adil, jacob ");
        movieItem item3 = new movieItem("Iron man", "Tonny");


        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);
        myMovie.addmovieItem(item3);

        myMovie.printmovieDetails();
    }
}