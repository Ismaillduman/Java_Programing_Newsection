package practiseTasks.day_1to_8;

public class HTTPStatus {
    public static void main(String[] args) {
        int statusCode= 5623;
        String status ;

        status= (statusCode==200)? "OK" : (statusCode==201)? "Created" :(statusCode==202)? "Accepted" :(statusCode==301)? " Moved Permanently" :
                (statusCode==303)? "See other" : (statusCode==304)? "NOT Modified" :(statusCode==307)? "Temporary Redirect" :(statusCode==400)? "BAD Request" :
                        (statusCode==401)? "Unauthorized" :(statusCode==403)? "Forbidden" :(statusCode==404)? "Not Found" :(statusCode==410)? "GONE" :
                                (statusCode==500)? "Internal Server Error" :(statusCode==503)? "Service Unavailable" : "Enter valid request";
        System.out.println("status = " + status);

    }
}
