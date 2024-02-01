package com.quiz.services;

import com.quiz.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> getAll();

    Quiz getQuiz(Long id);
}
