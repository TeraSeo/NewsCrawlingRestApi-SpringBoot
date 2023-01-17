package com.example.demo.repository;

import com.example.demo.form.KoreanNewsDto;

import java.io.IOException;
import java.util.HashMap;

public interface CrawlingService {

    HashMap<Integer, KoreanNewsDto> KoreanCrawlingService() throws IOException;
    void UsCrawlingService(String url);

}
