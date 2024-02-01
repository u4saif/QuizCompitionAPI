package com.quiz.controllers;

import com.quiz.entities.Quiz;
import org.springframework.web.bind.annotation.*;
import com.quiz.services.QuizService;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizControl {

    private QuizService quizService;

    public QuizControl(QuizService quizService) {
        this.quizService = quizService;
    }

    //Create Quiz
    @PostMapping
    public Quiz creatQuiz(@RequestBody  Quiz quiz){
        return quizService.add(quiz);
    }

    //Get all Quiz

    @GetMapping
    public List<Quiz> getAllQuiz(){
        return quizService.getAll();
    }
}
