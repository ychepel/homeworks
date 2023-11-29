package lesson16;

//Задача 6: Пользователь Создайте класс User, содержащий свойства username (имя пользователя) и password
// (пароль пользователя), конструктор для их инициализации, и метод validatePassword который принимает два
// аргумента (логин и пароль) и возвращающий true, если пароль и логин соответствует заданным правилам,
// и false в противном случае.

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validatePassword(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
