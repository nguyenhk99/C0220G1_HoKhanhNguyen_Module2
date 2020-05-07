package Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Huynh Tinh
 */
// tao class Student + implement Comparable
class Student implements Comparable {

    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
    // Override phuong thuc, so sanh dua theo ten

    // tra ve tên cua phan tu
    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Student tynk = new Student("tynk", 19, 12);
        Student java = new Student("java", 10, 5);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tynk);
        arrayList.add(java);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}