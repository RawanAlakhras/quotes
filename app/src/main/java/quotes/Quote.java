package quotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Quote {
    private String []tags;
    private String author;
    private String likes;
    private String text;

    public Quote(){

    }
    public Quote(String tags [], String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public void setTags(String [] tags) {
        this.tags = tags;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "tags=[" + Arrays.toString(tags) +
                "],{ author:'" + author + '}' +
                ",{ likes:'" + likes + '}' +
                ",{ text:'" + text + '}' +
                '}';
    }
}
