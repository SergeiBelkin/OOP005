package task2;

import org.example.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> users);
}
