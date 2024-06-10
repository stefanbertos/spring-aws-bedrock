package com.example.bedrock;

import com.bedrock.ai.client.BedrockAiClient;
import com.bedrock.ai.client.model.AiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BedrockController {

    @Autowired
    private BedrockAiClient bedrockAiClient;

    @GetMapping("/ai")
    public AiResponse getAiResponse(@RequestParam String query) {
        return bedrockAiClient.getResponse(query);
    }
}
