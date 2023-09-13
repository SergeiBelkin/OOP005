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


    public void create(String name,int score, int age) {

    }


    public void create(String name, String objectToTichen, int age) {
        Teacher teachers = new Teacher(name, objectToTichen, age );

    }
}
