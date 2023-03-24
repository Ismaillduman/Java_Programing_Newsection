package office_hours.week_7;

public class MusicPlayList {
    /*Create a class called MusicPlaylist
    declare these instance variables:
        name, number of songs, runtime length, current track (int)

    create a setInfo() method to initialize these variables

    create a method next()
        it is a void method with no parameters, but whenever it is run the current track number is updated by one

    create a method removeSong()
        it is a void method with no parameters, but whenever it it run a song is removed from the playlist
         so reduce the number of songs by one

    create a toString() that shows the information in the following format:
        The $name playlist is currently on track $track_number
        It has $num_of_songs which runs for a total of $runtime_length

    use the ObjectTester class and create some MusicPlaylist objects*/

    public String name;
    public int numberOfSongs, runtimeLength,currentTrack;

    public void setInfo(String name, int numberOfSongs, int runtimeLength, int currentTrack) {
        this.name = name;
        this.numberOfSongs = numberOfSongs;
        this.runtimeLength = runtimeLength;
        this.currentTrack = currentTrack;
    }

    public void next(){
        currentTrack++;
    }

    public void removeSong(){
        numberOfSongs--;
    }


    public String toString() {
        return "The "+name+" playlist is currently on track "+currentTrack+
                " It has "+numberOfSongs+" which runs for a total of "+runtimeLength;

    }
}
