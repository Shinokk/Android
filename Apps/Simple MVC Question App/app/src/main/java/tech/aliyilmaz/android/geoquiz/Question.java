package tech.aliyilmaz.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswerButtonClicked;
    public Question(){

    }
    public boolean ismAnswerButtonClicked() {
        return mAnswerButtonClicked;
    }

    public void setmAnswerButtonClicked(boolean mAnswerButtonClicked) {
        this.mAnswerButtonClicked = mAnswerButtonClicked;
    }

    public Question(int mTextResId, boolean mAnswerTrue, boolean mAnswerButtonClicked) {
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
        this.mAnswerButtonClicked = mAnswerButtonClicked;
    }

    public Question(int mTextResId, boolean mAnswerTrue) {
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}
