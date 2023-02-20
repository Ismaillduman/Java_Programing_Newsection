package replit_tasks;

import java.util.Scanner;

public class HTTPStatusCode {
    public static void main(String[] args) {
        System.out.println("Enter status code:");
        Scanner scan=new Scanner(System.in);
        int status= scan.nextInt();
        String response="";

       /*

> - 200: OK
> - 201: Created
> - 202: Accepted
> - 307: Temporary Redirect
> - 400: Bad Request
> - 401: Unauthorized
> - 403: Forbidden
> - 404: Not Found
> - 410: Gone
> - 500: Internal Server Error
> - 303: Service Unavailable
> - Any other number should output: Invalid status code
*/
        switch (status){
            case 200:
                response="OK";
                break;
            case 201:
                response="Created";
                break;
            case 202:
                response="Accepted";
                break;
            case 307:
                response="Temporary Redirect";
                break;
            case 400:
                response="Bad Request";
                break;
            case 401:
                response="Unauthorized";
                break;
            case 403:
                response="Forbidden";
                break;
            case 404:
                response="Not Found";
                break;
            case 410:
                response="Gone";
                break;
            case 500:
                response="Internal Server Error";
                break;
            case 303:
                response="Service Unavailable";
                break;
            default:
                response="Invalid status code";


        }
        System.out.println(response);






        /*
Main topics: switch statements, primitive variables

**Example Flows:**

```
  Enter status code:
  200
  OK
```
```
  Enter status code:
  400
  Unauthorized
```
```
  Enter status code:
  999
  Invalid status code
```*/
    }
}
