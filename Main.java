import account.AccountView;
import board.BoardView;
import crawler.CrawlerService;
import crawler.CrawlerView;
import user.UserView;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=== [메인화면] 0-종료 1-User 2-Board 3-Account " +
                    "4-Crawler ===");
            switch (sc.next()){
                case "0":  return;
                case "1": UserView.main(sc);break;
                case "2": BoardView.main(); break;
                case "3": AccountView.main(sc); break;
                case "4": CrawlerView.main(sc); break;
            }
        }
    }
}