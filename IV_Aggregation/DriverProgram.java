//CS5800 - HOMEWORK 4 - AGGREGATION
//RAJ AHIR - 019330454

public class DriverProgram {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor ins2 = new Instructor("John", "Smith", "4-1520");

        Textbook text1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook text2 = new Textbook("Software Engineering", "Ian Sommerville", "Pearson");

        Course course = new Course("Advanced Software Engineering", ins1, ins2, text1, text2);

        course.print();
    }
}