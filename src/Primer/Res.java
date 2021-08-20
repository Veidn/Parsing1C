package Primer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Res {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://4pda.to").get();
        Elements hElements = document.getAllElements();
        System.out.println(document.toString());
//        hElements.forEach(element -> {
//
//            System.out.println(element.toString());
//
//
//        });
    }


}

