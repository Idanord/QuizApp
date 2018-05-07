package com.example.will.geoquiz;

/**
 * Created by Will on 5/6/2018.
 */

public class Question {

    //instance variables
    private int mTextResId;
    private boolean mAnswerTrue;

    //constructor
    public Question (int textResId, boolean answerTrue){
        //set instance variable to method args
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
