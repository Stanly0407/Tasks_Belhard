package gantry;

public class Books {
    private String title;
    public Books (String title) {
        this.title = title; }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Название книги: \"" + title + "\"" + ".";
    }
}
