package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getAllQuestions();

    Question getQuestionById(Long id);

    List<Question> getQuestionOfQuizId(Long id);

}
