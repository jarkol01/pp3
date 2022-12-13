import java.util.ArrayList;

public class Folder {
    private ArrayList<File> files = new ArrayList<File>();
    private String title;

    public Folder(String title) {
        this.title = title;
    }


    public void display() {
        for (File i : files) {
            System.out.println(i.getName());
        }
    }

    public void newFile(String name, int size, String dateOfCreation) {
        files.add(new File(name, size, dateOfCreation));
    }

    public void deleteFile(String name) {
        for (File i : files) {
            if (i.getName() == name) {
                files.remove(i);
                System.out.println("Usunięto plik");
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Folder f1 = new Folder("Nowy Folder");
        f1.newFile("Pierwszy plik", 13, "12.12.2022");
        f1.newFile("Drugi plik", 5, "13.12.2022");
        f1.display();
        f1.newFile("Trzeci plik", 5, "13.12.2022");
        f1.display();
        f1.deleteFile("Drugi plik");
        f1.display();
    }
}

