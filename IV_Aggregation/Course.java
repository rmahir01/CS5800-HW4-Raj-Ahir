//CS5800 - HOMEWORK 4 - AGGREGATION
//RAJ AHIR - 019330454

public class Course {

    private String cName;
    private Instructor ins1;
    private Instructor ins2;
    private Textbook text1;
    private Textbook text2;

    public Course(String cName, Instructor ins1, Instructor ins2, Textbook text1, Textbook text2) {
        this.cName = cName;
        this.ins1 = ins1;
        this.ins2 = ins2;
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Instructor getins1() {
        return ins1;
    }

    public void setins1(Instructor ins1) {
        this.ins1 = ins1;
    }

    public Instructor getins2() {
        return ins2;
    }

    public void setins2(Instructor ins2) {
        this.ins2 = ins2;
    }

    public Textbook gettext1() {
        return text1;
    }

    public void settext1(Textbook text1) {
        this.text1 = text1;
    }

    public Textbook gettext2() {
        return text2;
    }

    public void settext2(Textbook text2) {
        this.text2 = text2;
    }

    public void print() {
        System.out.println("Course Name: " + cName);
        System.out.println("Instructor 1: " + ins1.getfName() + " " + ins1.getlName());
        System.out.println("Instructor 2: " + ins2.getfName() + " " + ins2.getlName());
        System.out.println("Textbook 1: " + text1.getTitle() + " by " + text1.getAuthor());
        System.out.println("Textbook 2: " + text2.getTitle() + " by " + text2.getAuthor());
    }
}