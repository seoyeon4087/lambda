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
            System.out.println("=== [메인화면] 0-종료 1-게시판 2-사용자관리 3-게시판 " +
                    "4-카우프 5-사용자관리(맵) 6-어카운트관리 ===");
            switch (sc.next()){
                case "0":  return;
                case "1": BoardView.main();break;
                case "2": UserView.main(sc); break;
                case "3": AccountView.main(sc); break;
                case "4": CrawlerView.main(sc); break;
            }
        }
    }
}