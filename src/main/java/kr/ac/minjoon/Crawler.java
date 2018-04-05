package kr.ac.minjoon;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class  Crawler {


    public Elements get(String s) throws IOException {
        Document doc = Jsoup.connect("https://orionjeong.github.io/").get();
        Elements element =doc.select(s);

        return element;



    }
}
