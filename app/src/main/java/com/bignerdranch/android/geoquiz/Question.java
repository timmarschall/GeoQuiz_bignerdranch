package com.bignerdranch.android.geoquiz;

/**
 * Created by Tim on 1/18/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question (int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
}
