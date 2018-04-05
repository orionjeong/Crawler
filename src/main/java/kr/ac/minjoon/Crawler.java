package kr.ac.minjoon;


        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.nodes.Element;
        import org.jsoup.select.Elements;

        import java.io.IOException;

public class  Crawler {


    public Elements getAll(String s) throws IOException {
        Elements elements = getElements(s);

        return elements;
    }

    private Elements getElements(String s) throws IOException {
        Document doc = Jsoup.connect("https://orionjeong.github.io/").get();
        return doc.select(s);
    }


    public String[] getLinkAll(String s) throws IOException {
        Elements elments = getElements(s);
        String url[] = new String[elments.size()];
        for(int i=0; i<elments.size(); i++){
            url[i]=elments.get(i).attr("href");
        }
        return url;

    }
}
