package com.example.demo.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KoreanNewsDto {

    String categoryName;
    String address;
    String title;
    String content;
    String date;
    String image;

}
