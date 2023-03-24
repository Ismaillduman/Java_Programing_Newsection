package office_hours.week_7;

public class TestMusicList {


    public static void main(String[] args) {
        MusicPlayList playList= new MusicPlayList();
        playList.setInfo("Cem Adrian",12,60,3);
        playList.next();
        playList.removeSong();
        System.out.println(playList);
    }
}
