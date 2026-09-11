//CS5800 - HOMEWORK 4 - COMPOSITION
//RAJ AHIR - 019330454

import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    private ArrayList<Object> contents;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
        this.contents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(File file) {
        files.add(file);
        contents.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
        contents.add(folder);
    }

    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
        contents.remove(folder);
    }

    public void print() {
        print("");
    }

    private void print(String indentation) {

        System.out.println(indentation + name);

        for (Object item : contents) {

            if (item instanceof File) {
                File file = (File) item;
                System.out.println(indentation + "    " + file.getName());

            } else if (item instanceof Folder) {
                Folder folder = (Folder) item;
                folder.print(indentation + "    ");
            }
        }
    }
}
