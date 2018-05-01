package com.utu.gcloudspringnlp;

import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Sentiment;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class LanguageService {

    public String run(String text) throws Exception {
        try (LanguageServiceClient language = LanguageServiceClient.create()) {

            Document doc = Document.newBuilder()
                    .setContent(text).setType(Document.Type.PLAIN_TEXT).build();
            Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();

            return sentiment.getScore() + " (score)" + ", " + sentiment.getMagnitude() + " (magnitude)";
        }
    }
}