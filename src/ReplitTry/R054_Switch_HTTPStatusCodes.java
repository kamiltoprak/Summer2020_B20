package ReplitTry;
/*HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:


        STATUS CODES
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

        Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

        Example:
        Display message: "Enter status code:"
        input: 200
        Display message: "OK"*/
import java.util.*;

public class R054_Switch_HTTPStatusCodes {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            System.out.println("Enter status code:");
            Scanner scan=new Scanner(System.in);
            int code=scan.nextInt();
            String description="";
            switch (code){
                case 200:
                    description="OK";
                    break;
                case 201:
                    description="Created";
                    break;
                case 202:
                    description="Accepted";
                    break;
                case 301:
                    description="Moved Permanently";
                    break;
                case 303:
                    description="See other";
                    break;
                case 304:
                    description="Not modified";
                    break;
                case 307:
                    description="Temporary Redirect";
                    break;
                case 400:
                    description="Bad Request";
                    break;
                case 401:
                    description="Unauthorized";
                    break;
                case 403:
                    description="Forbidden";
                    break;
                case 404:
                    description="Not Found";
                    break;
                case 410:
                    description="Gone";
                    break;
                case 500:
                    description="Internal Server Error";
                    break;
                case 503:
                    description="Service Unavailable";
                    break;
                default:
                    description="Invalid status code!";

            }
            System.out.println(description);
        }
    }

