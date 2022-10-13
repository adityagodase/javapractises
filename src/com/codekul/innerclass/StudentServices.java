package com.codekul.innerclass;

public interface StudentServices {
    String getStudent();
    int getRno();
    void addStudent(int rno,String student);

}

class Student{

    public static void main(String[] args) {

        StudentServices studentServices = new StudentServices() {
            String student=null;
            int rno;
            @Override
            public String getStudent() {
                return student ;
            }

            @Override
            public int getRno() {
                return rno;
            }

            @Override
            public void addStudent(int rno,String student) {
                this.student=student;
                this.rno =rno;
            }
        };
        studentServices.addStudent(11,"Aditya");

        System.out.println("student name :"+studentServices.getStudent()+" and roll no:"+studentServices.getRno());
    }
}
