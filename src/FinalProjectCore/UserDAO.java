package FinalProjectCore;

import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO <User> {
    private static UserDAO userDAO;
    private List <User> usersBase = new ArrayList<>();

    // изначально база юзеров будет содержать одного тестового юзера. Остальных будем добавлять при регистрации
    private UserDAO() {
        usersBase.add(new User(11111l, "testUser"));
    }

    public static UserDAO getUserDAO (){
        if (userDAO == null) userDAO = new UserDAO();
        return userDAO;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean edit(User user) {
        return false;
    }

    @Override
    public boolean remove(User user) {
        return false;
    }

    public List<User> getUsersBase() {
        return usersBase;
    }
}
