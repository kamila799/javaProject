package objects;

public class FacebookUser {
    String username;
    String password;
    String firstName;
    String laseName;

    public void login(String username, String password) {
        System.out.println(username + " logged in to the application");
    }

    public static void main(String[] args) {

        FacebookUser user = new FacebookUser(); // new object was created in the heap
        user.login("abc", "abc123");
        user.username = "tokyo";
        user.password = "abc123";







}
}
