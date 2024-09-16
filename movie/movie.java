package movie;

import java.util.ArrayList;
import java.util.List;

public class movie {
    private List<movieItem> movieItems;

    public movie() {
        movieItems = new ArrayList<>();
    }

    public void addmovieItem(movieItem item) {
        movieItems.add(item);
    }

    public void printmovieDetails() {
        for (movieItem item : movieItems) {
            item.printDetails();
        }
    }
}