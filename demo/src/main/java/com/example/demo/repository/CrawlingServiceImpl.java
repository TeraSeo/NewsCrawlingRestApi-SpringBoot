package com.example.demo.repository;

import com.example.demo.form.KoreanNewsDto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;

@Service
public class CrawlingServiceImpl implements CrawlingService{
    @Override
    public HashMap<Integer, KoreanNewsDto> KoreanCrawlingService() throws IOException {
        String title = "";
        String url = "https://en.yna.co.kr/culture/k-pop";
        HashMap<Integer, KoreanNewsDto> koreanNewsDtoMap = new HashMap<>();
        Document doc = Jsoup.connect(url).get();
        Elements elem = doc.select(".pg-tit");
        title = elem.text();
        Elements elem1 = doc.getElementsByTag("article");
        int i = 0;
        for(Element e: elem1) {
            if (!e.select(".tit").text().isEmpty() && e.select(".tit").text().length() != 0){
                KoreanNewsDto koreanNewsDto = KoreanNewsDto.builder()
                        .categoryName(title)
                        .image(e.getElementsByTag("figure").select("img").attr("src"))
                        .address(e.getElementsByTag("figure").select("a").attr("href"))
                        .title(e.select(".tit").text())
                        .date(e.select(".date").text())
                        .content(e.select(".lead").text())
                        .build();

                koreanNewsDtoMap.put(i, koreanNewsDto);

                i++;
            }


        }
        return koreanNewsDtoMap;
    }

    @Override
    public void UsCrawlingService(String url) {

    }
}
