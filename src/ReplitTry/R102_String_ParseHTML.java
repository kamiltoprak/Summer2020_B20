package ReplitTry;
/*Write a program, that will read html variable and output attribute value of id attribute (tag) into the console. Input will be provided in a single line as outlined below. If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!".

        Example:
        input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
        output: myid*/
import java.util.*;
public class R102_String_ParseHTML {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String html = scan.nextLine();
    if (html.contains("<html>")){
            System.out.println(html.substring(html.lastIndexOf("=") + 2  , html.lastIndexOf("\"")));
        } else {
            System.out.println("Invalid input!");
        }

    }
}

