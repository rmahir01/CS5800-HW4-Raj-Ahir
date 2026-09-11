//CS5800 - HOMEWORK 4 - COMPOSITION
//RAJ AHIR - 019330454

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
