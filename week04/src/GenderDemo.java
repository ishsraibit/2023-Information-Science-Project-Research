import java.util.Scanner;

public class GenderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ssn number(13 digits) : ");
        String socialSecurityNumber = scanner.nextLine();

        char gender = socialSecurityNumber.charAt(6);

        switch (gender){
            case '1':
            case '3':
                System.out.println("Male");
                break;
            case '2':
            case '4':
                System.out.println("Female");
                break;
            default:
                System.out.println("Wrong ssn!");
        }
    }
}
