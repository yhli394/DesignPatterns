package yhli.work.designpatternsdemo.prototypepattern.p1;

import yhli.work.designpatternsdemo.prototypepattern.p0.AnswerQuestion;
import yhli.work.designpatternsdemo.prototypepattern.p0.ChoiceQuestion;
import yhli.work.designpatternsdemo.prototypepattern.p1.util.Topic;
import yhli.work.designpatternsdemo.prototypepattern.p1.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @author yhli3
 * @ClassName QuestionBank.java
 * @packageName yhli.work.designpatternsdemo.prototypepattern.p1
 * @createTime 2022年12月08日 14:39:00
 */
public class QuestionBank implements Cloneable{

    private String candidate;
    private String number;

    protected ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();

    protected ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        System.out.println(questionBank==this);
        System.out.println(questionBank.choiceQuestionList==this.choiceQuestionList);
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        System.out.println(questionBank.choiceQuestionList==this.choiceQuestionList);
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        //题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);
        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        //选择题答案乱序
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\r\n"+"考生："+candidate+"\r\n"+"考号："+number+"\r\n"+"------------\r\n"+"一、选择题"+"\r\n\n");
        for (int i = 0; i < choiceQuestionList.size(); i++) {
            sb.append("第").append(i+1).append("题：").append(choiceQuestionList.get(i).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(i).getOption();
            for (String key : option.keySet()) {
                sb.append(key).append(": ").append(option.get(key)).append("\r\n");
            }
            sb.append("答案").append(choiceQuestionList.get(i).getKey()).append("\r\n\n");
        }
        sb.append("二、问答题"+"\r\n\n");
        for (int i = 0; i < answerQuestionList.size(); i++) {
            sb.append("第").append(i+1).append("题：").append(answerQuestionList.get(i).getName()).append("\r\n");
            sb.append("答案：").append(answerQuestionList.get(i).getKey()).append("\r\n\n");
        }
        return sb.toString();
    }

}
