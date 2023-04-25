package office_hours.week_12.app;

import office_hours.week_12.app.App;

public class Youtube extends App {
    public Youtube(String appName, String version) {
        super(appName, version);
    }

    public  void watchVideo(){
        System.out.println("watching github tutorial");
    }
    /*Create a class Youtube

        - Youtube class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            watchVideo()
                Example output: prints Watching java tutorial*/
}
