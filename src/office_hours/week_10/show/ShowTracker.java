package office_hours.week_10.show;

import java.util.ArrayList;

public class ShowTracker {
    public String userName;
    public String password;
    public int numOfShowsWatched;
    public ArrayList<Show> trackedShows = new ArrayList<>();

    public ShowTracker(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public ShowTracker(String userName, String password, int numOfShowsWatched) {
        this(userName, password);
        this.numOfShowsWatched = numOfShowsWatched;
    }

    public ShowTracker(String userName, String password, int numOfShowsWatched, ArrayList<Show> trackedShows) {
        this(userName, password, numOfShowsWatched);
        this.trackedShows.addAll(trackedShows);
    }

    public void trackShow(Show name) {
        for (Show eachtrackedShow : trackedShows) {
            if (!eachtrackedShow.equals(name)) {
                trackedShows.add(name);
            }
        }
    }

    public ArrayList<Show> filter(String language) {
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        filtered.removeIf(p -> !p.audioLanguagesAvailable.contains(language));
        return filtered;
    }

    public ArrayList<Show> filter(boolean complete) {
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);

        filtered.removeIf(p -> p.isCompleted != complete);
        return filtered;


    }


    public String toString() {
        return "ShowTracker{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", numOfShowsWatched=" + numOfShowsWatched +
                '}';
    }
    /*

    create a constructor that will initialize the username and password
    create a constructor that will initialize the username, password & number of shows watched
    create a constructor that will initialize the username, password, number of shows watched & the list of shows

    create method trackShow(Show)
        this method will accept the name of a show. Check if the show is already tracked and if it is not add it to the list of shows

    create a method filter(String)
        return all the shows that are available in the defined language
            ex: filter("english") -> returns all the shows that have English available

    overload the method to accept a boolean argument filter(boolean)
        if the boolean is true return the list of shows that are complete
        if the boolean is false return the list of shows that are ongoing
            ex: filter(true) -> return all the shows that are complete

    create a toString*/
}
