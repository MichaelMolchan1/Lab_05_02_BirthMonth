public class Main {
    public static void main(String[] args) {
        int birthMonth = 12;
        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("You entered an invalid birth month of " + birthMonth);
        }
    }
}