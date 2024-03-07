package crawler;

import common.AbstractRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CrawlerRepository extends AbstractRepository {
    private static CrawlerRepository instance = new CrawlerRepository();
    private CrawlerRepository repository;
    private Map<String, ?> map;
    private CrawlerRepository(){
        repository = CrawlerRepository.getInstance();
    }
    public static CrawlerRepository getInstance(){return instance;}

    @Override
    public Map<String, ?> save(Map<String, ?> paramMap) throws IOException {
        Document doc = Jsoup.connect("https://music.bugs.co.kr/chart").timeout(10*1000).get();
        Elements elems = doc.select("table.byChart");
        Iterator<Element> title = elems.select("p.title").iterator();
        Iterator<Element> artist = elems.select("p.artist").iterator();
        Iterator<Element> rank = elems.select("strong").iterator();

        Map<String, Iterator<Element>> localeMap = new HashMap<>();

        localeMap.put("title", title);
        localeMap.put("artist", artist);
        localeMap.put("rank", rank);

        map = localeMap;

        return map;
    }

    @Override
    public Map<String, ?> melon(Map<String, ?> paramMap) throws IOException {
        Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").timeout(10*1000).get();
        Elements elems = doc.select("tbody");
        Iterator<Element> title2 = elems.select("div.ellipsis.rank01 > span").iterator();
        Iterator<Element> artist2 = elems.select("div.ellipsis.rank02 span").iterator();
        Iterator<Element> rank2 = elems.select("td span.rank").iterator();

        Map<String, Iterator<Element>> localeS2Map = new HashMap<>();

        localeS2Map.put("title2", title2);
        localeS2Map.put("artist2", artist2);
        localeS2Map.put("rank2", rank2);

        map = localeS2Map;

        return map;
    }


}