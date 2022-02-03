package Member;

public class User {
    String id;
    String password;

    String login(String id, String password) {
        this.id = id;
        this.password = password;
        return  "id: " + id + "| password: " + password;
    }
}
