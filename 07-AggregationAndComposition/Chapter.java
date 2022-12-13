public class Chapter {
    int startOfChapter;
    int lengthInPages;
    String name;
    
    public Chapter(int startOfChapter, int lengthInPages, String name) {
        this.startOfChapter = startOfChapter;
        this.lengthInPages = lengthInPages;
        this.name = name;
    }

    public int getStartOfChapter() {
        return startOfChapter;
    }

    public void setStartOfChapter(int startOfChapter) {
        this.startOfChapter = startOfChapter;
    }

    public int getNumberOfPages() {
        return lengthInPages;
    }

    public void setNumberOfPages(int lengthInPages) {
        this.lengthInPages = lengthInPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
