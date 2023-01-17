package com.example.demo.form;

import com.example.demo.repository.CrawlingService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KoreanNewsDtoTest {

    @Autowired
    private CrawlingService crawlingService;

    @Test
    void Crawling() throws IOException {

//        HashMap<Integer, KoreanNewsDto> koreanNewsDtoHashMap = crawlingService.KoreanCrawlingService();
//        for (int i = 0; i < koreanNewsDtoHashMap.size(); i++){
//            System.out.println(koreanNewsDtoHashMap.get(i).getCategoryName());
//            System.out.println(koreanNewsDtoHashMap.get(i).getDate());
//            System.out.println(koreanNewsDtoHashMap.get(i).getAddress());
//            System.out.println(koreanNewsDtoHashMap.get(i).getImage());
//            System.out.println(koreanNewsDtoHashMap.get(i).getContent());
//            System.out.println(koreanNewsDtoHashMap.get(i).getTitle());
//            System.out.println();
//
//        }

//        String url = "https://www.foxnews.com";
//        Document doc = Jsoup.connect(url).get();
//        Elements elem = doc.getElementsByClass("content article-list");
//        for (Element e : elem){
//            System.out.println(e);
//        }
        String url = "https://www.foxbusiness.com/politics";
        Document doc = Jsoup.connect(url).get();
        Elements elem = doc.getElementsByTag("article");
        for (Element e : elem){
            System.out.println(e);
        }

    }

}