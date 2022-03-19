package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment1Q2Question {
    private String Questionid;
    private String Question;
    private List<String>Answers;
    private Set<String>Answers1;
    private Map<Integer,String>Answers2;


    public Map<Integer, String> getAnswers2() {
        return Answers2;
    }

    public void setAnswers2(Map<Integer, String> answers2) {
        Answers2 = answers2;
    }


    public Set<String> getAnswers1() {
        return Answers1;
    }

    public void setAnswers1(Set<String> answers1) {
        Answers1 = answers1;
    }



    public String getQuestionid() {
        return Questionid;
    }

    public void setQuestionid(String questionid) {
        Questionid = questionid;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public List<String> getAnswers() {
        return Answers;
    }

    public void setAnswers(List<String> answers) {
        Answers = answers;
    }
    public void ListDetails(){
        System.out.println(" QuestionId: "+getQuestionid()+ " "+" Questions :" +getQuestion() );
        for(String ans:Answers){
            System.out.println(ans);
        }
    }
    public void SetDetails(){
        System.out.println(" QuestionId: "+getQuestionid()+ " "+" Questions :" +getQuestion()+" "+getAnswers1());
    }
    public void Mapdetails(){
        System.out.println(" QuestionId: "+getQuestionid()+ " "+" Questions :" +getQuestion()+" "+getAnswers2());
    }
}
