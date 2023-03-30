package org.j2os.api;

import org.j2os.common.LinkCrawler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Set;

/*
    Bahador, Amirsam
 */
@RestController
public class CrawlerAPI {
    @GetMapping("get-links")
    public Set getLinks() throws IOException {
        return LinkCrawler.getLinks("http://www.j2os.org");
    }


}
