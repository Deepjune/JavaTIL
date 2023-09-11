package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.GptService;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private GptService gptService;

    @PostMapping("/ask")
    public String askGPT(@RequestBody String userInput) {
        // userInput을 gpt api에 보내고 응담을 받아 반환
        String gptResponse = gptService.generateResponse(userInput);
        return gptResponse;
    }

}
