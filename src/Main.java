public class Main {
    public static void main(String[] args) {
        String login = "!love229999999999999999999999456468541947596542";
        String password = "lilo___1329138_@!";
        String confirmPassword = "bob1337___@3!&";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
            System.out.println("Получили wrongLoginException");
        } catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
            System.out.println("Получили wrongPasswordException");
        } finally {
            System.out.println("Работает блок finally");
        }
    }
}