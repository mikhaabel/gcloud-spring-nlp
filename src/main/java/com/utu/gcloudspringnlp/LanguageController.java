package com.utu.gcloudspringnlp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class LanguageController {

    @GetMapping("/input")
    public String inputForm(Model model) {
        model.addAttribute("sentimentModel", new SentimentModel());
        log.info("Showing input.html");
        return "input";
    }

    @PostMapping("/submit")
    public String inputSubmit(@ModelAttribute SentimentModel model) {
        model.setResult(model.getText());
        log.info("Showing result.html");
        return "result";
    }
}
