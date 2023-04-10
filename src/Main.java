import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your name");
            String name = sc.next();
            try {
                user.setName(name);
                System.out.println("Успешно! Ваше имя: " + user.getName());
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter your age");
            Integer age = sc.nextInt();
            try{
                user.setAge(age);
                System.out.println("Your age: " + user.getAge());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}