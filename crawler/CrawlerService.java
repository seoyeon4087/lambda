package crawler;

import java.io.IOException;
import java.util.Map;

public interface CrawlerService {
    Map<String, ?> findNamesFromWeb(Map<String, ?> parmMap) throws IOException ;
    Map<String, ?> melonChart(Map<String, ?>parmMap) throws IOException;

}