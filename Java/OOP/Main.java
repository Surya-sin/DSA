package OOP;

public class Main {
    public static void main(String[] args) {
        
    }
}

class Student{
    int rno;
    String name;
    float marks;
    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }
    Student(){
        this.rno = 13;
        this.name = "Surya Prakash";
        this.marks =  88.9f;
    }

    Student(int roll , String naam , float markss){
        this.rno = roll;
        this.name= naam;
        this.marks = markss;
    }

}
