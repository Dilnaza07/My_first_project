package Lesson31_modificators;

public class Book {

    private String author;
    private String title;
    private int pageCount;
    private String tedBy;
    private String pressmark;

    private boolean needsRepair;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.tedBy = tedBy;
        this.needsRepair = needsRepair;

        setPressmark();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        setPressmark();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setPressmark();
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        setPressmark();
    }


    public String getPressmark() {
        return pressmark;
    }

    private void setPressmark() {
        this.pressmark = author.substring(0, 1) + "." + title.substring(0, 1) + "." + pageCount;
    }

    private String getTedBy() {
        return tedBy;
    }

    private void setTedBy(String tedBy) {
        this.tedBy = tedBy;
    }

    private boolean isNeedsRepair() {
        return needsRepair;
    }

    private void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", pageCount=" + getPageCount() +
                ", pressmark='" + getPressmark() + '\'' +
                '}';
    }
}