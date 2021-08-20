package Test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        Connection.Response loginForm = Jsoup.connect("https://free.edu.1c.ru/library.html#")
                .method(Connection.Method.GET).execute();
        Object o = loginForm.cookies();
        Document document = Jsoup.connect("https://free.edu.1c.ru/library.html#node=872427&path=/26/29/872425/872426/872427/")
                .data("login", "Veidn")
                .data("password", "237891212qQ")
                .cookies(loginForm.cookies())
                .post();
        Elements hElements = document.getAllElements();
        hElements.forEach(element -> {

            System.out.println(element.toString());});
        System.out.println("ssadasfasf");




    }
    }



