package library;

public class Students {
    int student_id;
    String student_name;
    int classs;
    int no_of_book_borrowed;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getClasss() {
        return classs;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    public int getNo_of_book_borrowed() {
        return no_of_book_borrowed;
    }

    public void setNo_of_book_borrowed(int no_of_book_borrowed) {
        this.no_of_book_borrowed = no_of_book_borrowed;
    }

    public Students(int student_id, String student_name, int classs, int no_of_book_borrowed) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.classs = classs;
        this.no_of_book_borrowed = no_of_book_borrowed;
    }

    public void student_format(){
        System.out.println("The Student is "+this.student_name+" of class "+ this.classs+" and has "+this.no_of_book_borrowed+ " books borrowed");
    }
}
