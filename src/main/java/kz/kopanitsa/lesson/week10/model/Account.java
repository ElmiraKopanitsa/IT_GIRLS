package kz.kopanitsa.lesson.week10.model;
import java.util.HashMap;
import java.util.Map;


public class Account {
    private String login;
    private String password;
    private String repeatPassword;
    private HashMap <String, String> users = new HashMap<>();

    public Account(String login, String password, String repeatPassword) {
        // если логин и пароль введены не корректно, то сохраняет значение null
        try {
            checkLogin(login);
            checkPassword(password, repeatPassword);
            this.login = login;
            this.password = password;
            this.repeatPassword = repeatPassword;
            addUser(this.login, this.password);
        } catch (WrongLoginException e) {
            System.out.println("Исключение" + e);
        } catch (WrongPasswordException e) {
            System.out.println("Исключение" + e);
        }
    }

    public void addUser(String login, String password) {
        try {
            checkLoginAndPassword(login, password);
            users.put(login, password);
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Исключение" + e);
        }
    }

    public void printUser(Account account) {
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println("Логин: " + entry.getKey() + " Пароль: " + entry.getValue());
        }
    }

    private void checkLogin(String login) throws WrongLoginException {
        // проверяет, чтобы login на корректность
        if (login == null | login.length() < 5 | login.length() > 20) {
            System.out.println("Логин введен не корректно.");
            throw new WrongLoginException();
        }
    }

    private void checkPassword(String password, String repeatPassword) throws WrongPasswordException {
        // проверяет, чтобы password на корректность
        if (password == null | password.length() < 8 | password.length() > 20 | !password.equals(repeatPassword)) {
            System.out.println("Пароль введен не корректно.");
            throw new WrongPasswordException();
        }
    }

    public void checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {
        // проверяет, чтобы password на корректность
        if (users.containsKey(login) && users.get(login).equals(password)) {
            System.out.println("Такой пользователь уже существует.");
            throw new WrongLoginOrPasswordException();
        }
    }

    public String toString() {
        return "Ваш логин: " + this.login + "\nВаш пароль: " + this.password;
    }
}
