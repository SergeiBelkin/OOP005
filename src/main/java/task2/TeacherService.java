package task2;

import org.example.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private List <Teacher> teachers;
    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int score, int age) {
        Teacher teach = new Teacher(name, null, age);


        teachers.add(teach);

    }


    public void create(String name, String objectToTeach, int age) {
        Teacher teach = new Teacher(name, objectToTeach, age);
        teachers.add(teach);
    }

}
