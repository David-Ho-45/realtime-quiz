package demo.ScoreMgmt.controller;

import demo.QuizMgmt.dto.AnswersRequest;
import demo.ScoreMgmt.service.ScoreServive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
@Slf4j
public class ScoreController {

    @Autowired
    private ScoreServive scoreService;

    @PostMapping("/submit-answers")
    @ResponseStatus(HttpStatus.CREATED)
    public void submitAnswers(@RequestBody AnswersRequest answersRequest) {
        log.info("submitAnswers={}", answersRequest);
        scoreService.updateScore(answersRequest);
    }
}
