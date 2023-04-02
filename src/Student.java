import java.util.Objects;

public class Student {

    // Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.

    String name;
    int age;

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name,student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}