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
    public TikTokPost(String caption, int views, int likes, int shares, List<String> comments {
        this.caption = caption;
        this.views = views;
        this.likes = likes;
        this.shares = shares;
        this.comments = comments;
        this.hashtags = extractHashtags(caption); // auto-extract hashtags
    }
    // TODO: Method for extracting hashtags from caption; Add getter methods
}