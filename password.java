import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        
        if (isStrongPassword(password)) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password! Please follow the criteria.");
        }

        scanner.close();
    }

    public static boolean isStrongPassword(String password) {
        
        if (password.length() < 8) return false;

       
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if ("!@#$%^&*()_+=-".indexOf(ch) >= 0) hasSpecial = true;
        }

        
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
