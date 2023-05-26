// Write a Student Java Claszz
// Author: Big Stinky
// Date: 05/25/2023
// Version: 1.0 bitch

class Student {
    private String name;
    private int mark1;
    private int mark2;

    public Student() {
        this.name = "";
        this.mark1 = 0;
        this.mark2 = 0;
    }

    public Student(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public int getMarks(int markNumber) {
        if (markNumber == 1) {
            return this.mark1;
        } else {
            return this.mark2;
        }
    }

    public int calcTotal() {

        return this.mark1 + this.mark2;

    }

    public static void main(String[] args) {
        Student student = new Student("Jack", 60, 70);
        System.out.println(student.getMarks(1));
        System.out.println(student.getMarks(2));
        System.out.println(student.calcTotal());
    }

}
