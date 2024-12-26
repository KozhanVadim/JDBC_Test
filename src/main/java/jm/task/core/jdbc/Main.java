package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(); //Экземпляр

        userService.createUsersTable();

        userService.saveUser("Ниф", "Ниф", (byte) 30);
        userService.saveUser("Наф", "Наф", (byte) 25);
        userService.saveUser("Нуф", "Нуф", (byte) 28);
        userService.saveUser("Биба", "Биба", (byte) 35);

        List<User> users = userService.getAllUsers();
        System.out.println("Все пользователи из базы:");
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}


