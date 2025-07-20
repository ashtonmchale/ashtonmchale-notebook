import java.util.*;

// Defining the class and fields
public class TikTokPost {
    private String caption;
    private List<String> hashtags;
    private int views;
    private int likes;
    private int shares;
    private List<String> comments;

    // Creation of the constructor
    public TikTokPost(String caption, int views, int likes, int shares, List<String> comments) {
        this.caption = caption;
        this.views = views;
        this.likes = likes;
        this.shares = shares;
        this.comments = comments;
        this.hashtags = extractHashtags(caption); // auto-extract hashtags
    }

    // Extract hashtags from the caption (words starting with '#')
    private List<String> extractHashtags(String caption) {
        List<String> tags = new ArrayList<>();
        for (String word : caption.split("\\s+")) {
            if (word.startsWith("#") && word.length() > 1) {
                tags.add(word.substring(1));
            }
        }
        return tags;
    }
    // TODO: Method for extracting hashtags from caption; Add getter methods
}