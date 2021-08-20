package TestTime;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Map;

public class TestTime {
    public static void main(String[] args) throws IOException {
        //This will get you the response.
        Connection.Response res = Jsoup
                .connect("https://free.edu.1c.ru/library.html#")
                .data("login", "Veidn", "password", "237891212qQ")
                .method(Connection.Method.POST)
                .execute();

//This will get you cookies
        Map<String, String> loginCookies = res.cookies();

//And this is the easiest way I've found to remain in session
        Document doc = Jsoup.connect("https://free.edu.1c.ru/library.html#node=872427&path=/26/29/872425/872426/872427/")
                .cookies(loginCookies)
                .get();
        Elements hElements = doc.getAllElements();
        hElements.forEach(element -> {
            System.out.println(element.toString());


        });
    }


}

