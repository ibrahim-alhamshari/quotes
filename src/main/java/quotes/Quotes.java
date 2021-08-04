package quotes;

import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Quotes {

    private String author;
    private String likes;
    private String text;
    private ArrayList<String> tags = new ArrayList<>();

    public Quotes(Map randomItem) {
      this.author= (String) randomItem.get("author");
      this.likes = (String) randomItem.get("likes");
        String test=(String)randomItem.get("text");
        int until=test.length()-4;
        this.text = test.substring(4,until);
      this.tags = (ArrayList<String>) randomItem.get("tags");
        System.out.println(toString());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Contants:{" +
                "author: '" + author + '\'' +
                ", text: " + text + "\"" +
                '}';
    }
}
