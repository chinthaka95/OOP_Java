package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

           Student std1 = new Student();
           std1.setName("ABC Perera");
           std1.setAge(40);
           std1.setAddress("Colombo");

        System.out.println( std1.getName());
        System.out.println( std1.getAge());
        System.out.println(std1.getAddress());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        PostGraduateStudents pg1 = new PostGraduateStudents();
        pg1.setFirstDegree("BSC IT");
        pg1.setName("AMal");
        pg1.setAge(29);
        pg1.setAddress("Colombo2");

        System.out.println(pg1.getName());
        System.out.println(pg1.getAge());
        System.out.println(pg1.getAddress());
        System.out.println(pg1.getFirstDegree());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        UnderGraduateStudents ud1 = new UnderGraduateStudents();
        ud1.setName("Kamal");
        ud1.setAge(20);
        ud1.setAddress("Kurunegala");
        ud1.setScholership("Bursary");

        System.out.println(ud1.getName());
        System.out.println(ud1.getAge());
        System.out.println(ud1.getAddress());
        System.out.println(ud1.getScholership());

        System.out.println("====================");
    }
}