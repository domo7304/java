package class1;

public class Student {
    private final String name;
    private final Integer age;
    private final Integer score;

    public Student(String name, Integer age, Integer score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getScore() {
        return score;
    }

//    public String toString() {
//        return "이름: " + this.getName() +
//                " 나이: " + this.getAge().toString() +
//                " 성적: " + this.getScore().toString();
//    }
}
