package class1.ex1;

public class MovieReview {
    private final String title;
    private final String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return this.title;
    }

    public String getReview() {
        return this.review;
    }
}
