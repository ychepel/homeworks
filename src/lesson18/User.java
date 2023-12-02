package lesson18;

public class User {
    private String username;
    private String password;
    private String message;

    public User(String username, String password, String message) {
        this.username = username;
        this.password = password;
        this.message = message;
    }

    public void setPassword(String username, String oldPassword, String newPassword) {
        if (check(username, oldPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("permission denied");
        }
    }

    public String getPassword() {
        return getHiddenPassword();
    }

    public String getMessage(String username, String password) {
        if (check(username, password)) {
            return this.message;
        } else {
            return "permission denied";
        }
    }

    public String getInfo() {
        return String.format("%s (%s)", this.username, getHiddenPassword());
    }

    public void setName(String username) {
        int nameLength = username.length();
        if (nameLength >= 4 && nameLength <= 8) {
            this.username = username;
        } else {
            System.out.println("Вы указали неверный логин");
        }
    }

    private String getHiddenPassword() {
        return "*".repeat(password.length());
    }

    private boolean check(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
