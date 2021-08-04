package quotes;

import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Contants {

    private String author;
    private String likes;
    private String text;
    private ArrayList<String> tags = new ArrayList<>();

    public Contants(Map randomItem) {
      this.author= (String) randomItem.get("author");
      this.likes = (String) randomItem.get("likes");
      this.text = (String) randomItem.get("text");
      this.tags = (ArrayList<String>) randomItem.get("tags");
        System.out.println(toString());
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Contants{" +
                "author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                '}';
    }
}
