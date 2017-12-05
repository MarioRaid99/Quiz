package com.example.opilane.quiz;



public class Questions {
    //array of questions
    public String MyQuestions[] = {
            "What android Device's name starts with Sa?",
            "What kind of foods are android versions named after?",
            "What is the latest Iphone device?",
            "What is Life?",
            "What game is called CS:Go?"
    };
    public String MyChoices[][] = {
            {"Samsam", "Sangsung", "Samsung", "Samsing"},
            {"Fast food", "Thai Food", "Sweets", "Chinese food"},
            {"Iphone 1.6", "Iphone X", "Iphone C", "Iphone Z"},
            {"Struggle", "Happiness", "Sleeping", "Gaming"},
            {"Conan Straw:Global Omen", "Con Sta:Global Ohm", "Counter-Strike:Global Offenive", "Counter-Strike:Global Office"}
    };
    public String MyCorrectAnswers[] = {
            "Samsung", "Sweets", "Iphone X", "Sleeping", "Counter-Strike:Global Offensive"
    };

public int getLength () {
    return MyQuestions.length;
}
public String getQuestion(int a) {
    String question = MyQuestions[a];
    return question;
}
public String getChoice(int index, int num) {
    String choice0 = MyChoices[index][num - 1];
    return choice0;
}
public String getCorrectAnswer(int a) {
    String answer = MyCorrectAnswers[a];
    return answer;
}

