class Book{
    String name;
    int id;
    String Author;
    Book(String name, int id, String Author){
        this.name=name;
        this.id=id;
        this.Author=Author;
    }
    public void bDetails(){
        System.out.println("Name of book is "+ name);
        System.out.println("book id is "+ id);
        System.out.println("author of the book is "+ Author);
    }
}
interface performsAction {
    abstract void issuesBook();
    abstract void returnsBook();
}
class Student extends Book implements performsAction{
    String sname;
    int sid;
    Student(String name, int id, String Author, String sname, int sid){
        super(name, id, Author);
        this.sname=sname;
        this.sid=sid;
    }
    public void sDetails(){
        System.out.println("Name of student is "+ sname);
        System.out.println("student id is "+ sid);
    }
    public void issuesBook(){
        System.out.println(name+"book has been issued by student "+sname);
    }
    public void returnsBook(){
        System.out.println(name+ " book has been returned by student "+sname);
    }
}


public class Library {
    public static void main(String[] args) {
        Book b1= new Book("blue lock", 101, "random mangaka");
        Student s1= new Student("java porgramming", 20, "reema", "harsh", 51);
        b1.bDetails();
        s1.sDetails();
        s1.returnsBook();
        s1.issuesBook();
    }
}
