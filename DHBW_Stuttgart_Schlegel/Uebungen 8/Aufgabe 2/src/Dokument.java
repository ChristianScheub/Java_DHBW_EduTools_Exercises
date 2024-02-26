public class Dokument {
    public static void main(String[] args) {

    }
    Dokument(String author,String title, String inhalt){
        this.author = author;
        this.title = title;
        this.inhalt = inhalt;
    }
    private String author;
    private String title;
    private String inhalt;
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getInhalt() {
        return inhalt;
    }
}