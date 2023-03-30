package org.j2os.common;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
    Bahador, Amirsam
 */
public class LinkCrawler {
    private LinkCrawler() {
    }

    public static Set<String> getLinks(String url) throws IOException {
        Set<String> links = new HashSet<>();
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("a");
        for (Element element : elements) {
            String link = element.attr("href");
            links.add(link);
        }
        return links;
    }
}