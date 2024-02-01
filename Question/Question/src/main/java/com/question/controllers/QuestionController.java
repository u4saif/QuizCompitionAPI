package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return   questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/{questionID}")
    public Question getQuestionById(@PathVariable Long questionID){
        return questionService.getQuestionById(questionID);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuizId(@PathVariable Long quizId){
        return questionService.getQuestionOfQuizId(quizId);
    }

}
