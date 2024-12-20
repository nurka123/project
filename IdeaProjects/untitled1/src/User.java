public class User {
    private String name;
    private int age;
    private String userId;

    public User(String name, int age, String userId) {
        this.name = name;
        this.age = age;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String toString() {
        return "User{name='" + name + "', age=" + age + ", userId='" + userId + "'}";
    }

    public static void main(String[] args) {
        User user = new User("sasha", 19, "user123");
        System.out.println(user);
    }
}



