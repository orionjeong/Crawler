package kr.ac.minjoon;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.sql.SQLException;

public class CrawlerTest {
    private Crawler crawler;
    @Before
    public void setup() throws IOException {
        crawler = new Crawler();
    }

    @Test
    public void getAll() throws SQLException, ClassNotFoundException, IOException {
        Elements elements =crawler.getAll(".post-link");
        elements.forEach((s)-> System.out.println(s));
    }

    @Test
    public void getLinkAll() throws IOException {
       String url[] =crawler.getLinkAll(".post-link");
       for(int i=0; i<url.length; i++){
           System.out.println(url[i]);
       }
    }
}
