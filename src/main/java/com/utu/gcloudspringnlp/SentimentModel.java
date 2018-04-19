package com.utu.gcloudspringnlp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SentimentModel {
    private String text;
    private String result;
}
