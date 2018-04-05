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
    public void get() throws SQLException, ClassNotFoundException, IOException {
        Elements elements =crawler.get(".post-link");
        elements.forEach((s)-> System.out.println(s.text()));
    }
}
