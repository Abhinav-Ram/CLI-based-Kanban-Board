package App;

import Features.*;
import java.util.*;

public class Command {
  private String command;

  public void InputCommand() {
    Scanner sc = new Scanner(System.in);
    System.out.print(">> ");
    command = sc.nextLine();
    ExecuteCommand();
    return;
  }

  private void ExecuteCommand() {
    Action action;
    if (command.equals("disp")) {
      command = command + " -a";
    }
    String[] cmd = command.split(" ");
    // System.out.println(cmd[0]);
    if (cmd[0].equals("man")) {
      Message.Manual();
      InputCommand();
    } else if (cmd[0].equals("add")) {
      action = new AddTask();
      action.Action_Info();
      action.Action_Perform(null);
      InputCommand();
    } else if (cmd[0].equals("remove")) {
      action = new RemoveTask();
      action.Action_Info();
      String res = action.Action_Input();
      action.Action_Perform(res);
      InputCommand();
    } else if (cmd[0].equals("edit")) {
      action = new EditTask();
      action.Action_Info();
      String res = action.Action_Input();
      action.Action_Perform(res);
      InputCommand();
    } else if (cmd[0].equals("start")) {
      action = new StartTask();
      action.Action_Info();
      String res = action.Action_Input();
      action.Action_Perform(res);
      InputCommand();
    } else if (cmd[0].equals("complete")) {
      action = new CompleteTask();
      action.Action_Info();
      String res = action.Action_Input();
      action.Action_Perform(res);
      InputCommand();
    } else if (cmd[0].equals("exit")) {
      return;
    } else if (cmd[0].equals("disp")) {
      if (cmd[1].equals("-a")) {
        action = new DisplayTasks();
        action.Action_Info();
        action.Action_Perform(null);
        InputCommand();
      } else if (cmd[1].equals("-t")) {
        action = new DisplayTodoTasks();
        action.Action_Info();
        action.Action_Perform(null);
        InputCommand();
      } else if (cmd[1].equals("-p")) {
        action = new DisplayInprogressTasks();
        action.Action_Info();
        action.Action_Perform(null);
        InputCommand();
      } else if (cmd[1].equals("-c")) {
        action = new DisplayCompletedTasks();
        action.Action_Info();
        action.Action_Perform(null);
        InputCommand();
      } else if (cmd[1].equals("-b")) {
        action = new DisplayBacklogTasks();
        action.Action_Info();
        action.Action_Perform(null);
        InputCommand();
      } else {
        System.out.println("\nInvalid Option. Type \"man\" for more details.\n");
        InputCommand();
      }
    } else {
      System.out.println("\nInvalid Command. Type \"man\" for more details.\n");
      InputCommand();
    }
  }
}