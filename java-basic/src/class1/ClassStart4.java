package class1;

import java.util.Arrays;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 80);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("이름: " + student.getName() + " 나이: " + student.getAge() + " 점수: " + student.getScore());
        }

        System.out.println("\n" + Arrays.toString(students));
        System.out.println(student1);
        System.out.println(students[0]);

        student1.setName("객체의 필드 변경");
        System.out.println("\nstudent1의 이름과 주소: " + student1.getName() + ", " + student1);
        System.out.println("students[0]의 이름과 주소: " + students[0].getName() + ", " + students[0]);
    }
}
