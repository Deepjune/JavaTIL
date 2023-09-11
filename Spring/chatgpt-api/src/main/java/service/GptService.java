package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GptService {
    @Value("${gpt.apiKey}")
    private String apiKey; // API 키를 환경 변수 또는 비밀 설정 파일에서 가져옵니다.

    public String generateResponse(String userInput) {
        // GPT API에 요청을 보내고 응답을 반환합니다.
        String apiUrl = "https://api.gpt-service-provider.com"; // gpt api 엔드포인트 url
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(apiUrl, userInput, String.class);
        return response;
    }
}
