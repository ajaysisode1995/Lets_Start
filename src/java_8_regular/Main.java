package java_8_regular;

import java.util.Arrays;
import java.util.List;

class User
{
    private String name;
    private Integer age;
 
    public User(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
 
    public Integer getAge() {
        return age;
    }
 
    // other getters and setters
 
    @Override
    public String toString() {
        return "[" + name + ", " + String.valueOf(age) + "]";
    }
}
 
// Custom class
class Compare
{
    public static User min(User a, User b) {
        return a.getAge() < b.getAge() ? a : b;
    }
 
    public static User max(User a, User b) {
        return a.getAge() > b.getAge() ? a : b;
    }
}
 
// Find the maximum and minimum value of a field among custom objects
// using stream in Java 8 and above
class Main
{
    public static void main(String[] args)
    {
        List<User> users = Arrays.asList(new User("George", 15),
                new User("Tom", 10),
                new User("Mike", 12),
                new User("Ajay", 10)
                );
 
        // get a user with the minimum age
        User user1 = users.stream()
                .reduce(Compare::min)
                .get()
                ;
        System.out.println("User with minimum age: " + user1);
 
        // get a user with the maximum age
        User user2 = users.stream()
                .reduce(Compare::max)
                .get();
        System.out.println("User with maximum age: " + user2);
    }
}
