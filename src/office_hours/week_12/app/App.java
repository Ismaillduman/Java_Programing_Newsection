package office_hours.week_12.app;

public class App {
    private String appName,version;

    public App(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void download(){
        System.out.println(appName+" is downloading version "+version);
    }
    /*Create an App class

        - create variables:
            name (app name), version

        - create a constructor to initialize the variables

        - create method:
            download()
                Example output: prints $name is downloading version $version

    Create a class Instagram

        - Instagram class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            postPicture()
                Example output: prints Posting picture to Instagram

    Create a class Youtube

        - Youtube class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            watchVideo()
                Example output: prints Watching java tutorial
*/
}
