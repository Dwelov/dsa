public class Main{

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Total marks : " + s1.total());
        System.out.println("Average marks : " + s1.average());
        System.out.println("Percentage : " + s1.percentage());
        System.out.println("Grade : " + s1.grade());
    }   
}