package Lab03;

/*@Author wasi */

//class Novel starts from here 
public class Novel {

    // instance variable
    private String title;
    private String authorName;
    private int yearPublished;

    // constructor
    public Novel(String title, String authorName, int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
