public class MainDemo {
    // javac MainDemo.java -encoding utf-8
    // java MainDemo 0604074123456

    // Female
    public static void main(String[] args) {
        String socialSecurityNumber = args[0];
        char gender = socialSecurityNumber.charAt(6);

        String genderString = switch (gender){
            case '1', '3' -> "Male";
            case '2', '4' -> "Female";
            default -> "Wrong ssn!";
        };
        System.out.println(genderString);
    }
}
