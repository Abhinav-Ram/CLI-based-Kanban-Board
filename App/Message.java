package App;

import java.util.*;

public class Message {
  public static void OpeningMessage() {
    Scanner s = new Scanner(System.in);
    System.out.print(
        "\nWelcome to our Kanban board. This is a command line based workflow management system that can help to organize your everyday tasks. Use \"man\" for help on commands. Press enter to continue...\n");
    s.nextLine();
  }

  public static void ClosingMessage() {
    System.out.print("\nThanks for checking out on our app. Come again to check on your tasks. Peace :)\n");
  }

  public static void Manual() {
    System.out.println("exit - Exit the App (Use this, not Ctrl-C or any other mechanism)");
    System.out.println("add - Add a task to the board");
    System.out.println("remove - Remove a task from the board");
    System.out.println("edit - Edit a task in the board");
    System.out.println("start - Start a task in the board");
    System.out.println("complete - Complete a task in the board");
    System.out.println("disp - Display tasks, with options:-");
    System.out.println("\tdisp -c => all completed tasks");
    System.out.println("\tdisp -p => all in-progress tasks");
    System.out.println("\tdisp -t => all to-be-started tasks");
    System.out.println("\tdisp -b => all backlog tasks");
    System.out.println("\tdisp -a => all tasks");
  }
}