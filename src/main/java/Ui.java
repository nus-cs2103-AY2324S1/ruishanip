import java.util.Scanner;

public class Ui {
    private Scanner scanner;

    public Ui() {
        scanner = new Scanner(System.in);
    }

    public void showWelcome() {
        String logo =
                ".______     ______   .___________.\n" +
                        "|   _  \\   /  __  \\  |           |\n" +
                        "|  |_)  | |  |  |  | `---|  |----`\n" +
                        "|   _  <  |  |  |  |     |  |     \n" +
                        "|  |_)  | |  `--'  |     |  |     \n" +
                        "|______/   \\______/      |__|     \n";

        showLine();
        System.out.println("Hello I'm\n" + logo);
        System.out.println("What can I do for you?");
        showLine();
    }

    public void showBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void showList() {
        System.out.println("Here are the tasks in your list:");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showLine() {
        System.out.println("_________________________________________");
    }

    public void showErrMessage(DukeException exception) {
        System.out.println(exception.getMessage());
    }

    public void markMessage(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
    }

    public void unmarkMessage(Task task) {
        System.out.println("Ok, I've marked this task as not done yet:");
        System.out.println(task);
    }

    public void deleteMessage(Task task, int total) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
        System.out.println("Now you have " + total + " tasks in the list.");
    }

    public void addMessage(Task task, int total) {
        System.out.println("Got it. I've added this task:");
        System.out.println(task);
        System.out.println("Now you have " + total + " tasks in the list.");
    }

    public String readCommand() {
        return scanner.nextLine();
    }

}
