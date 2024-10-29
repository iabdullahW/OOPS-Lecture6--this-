class Student {
    int rollNo;
    String name;
    float fee;
    
    Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
       this.fee = fee;
    }
    
    void display() {
        System.out.println(rollNo + " " + name + " " + fee);
    }
}

class Lecture6 {
    public static void main(String[] args) {
        Student obj = new Student(18, "abdul", 20.2f);
        obj.display();
    }
}