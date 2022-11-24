import library.Books;
import library.Borrowing;
import library.Students;

public class main {
    public static void main(String[] args) {
        Books book1=new Books("Da Vinci Code",22,"Dan Brown",1234455,2015);
   book1.book_format();
   Students student1=new Students(11,"Prayush Shrestha",11,10);
   student1.student_format();
        Borrowing borrow1=new Borrowing(1,1,3,120);
        borrow1.borrow_format();
    }
}
