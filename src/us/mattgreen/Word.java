package us.mattgreen;

public class Word {

    private String w;
    private int count;

    public Word(String w, int c)
    {
        this.w = w;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getW() {
        return w;
    }

    @Override
    public String toString() {
        return w+" "+count;
    }
}
