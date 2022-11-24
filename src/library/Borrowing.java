package library;

public class Borrowing {
    int book_id;
    int student_id;
    int extra_days;
    int fineRate;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    public Borrowing(int book_id, int student_id, int extra_days, int fineRate) {
        this.book_id = book_id;
        this.student_id = student_id;
        this.extra_days = extra_days;
        this.fineRate = fineRate;
    }
    public void borrow_format(){
        System.out.println("The total fine for bookId "+this.book_id+" for "+ this.extra_days+" extra days is "+this.fineRate);
    }
}
