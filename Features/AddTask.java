package Features;

import Task.*;

public class AddTask extends Action {
  public void Action_Info(){
    System.out.print("\nADDING TASK TO THE BOARD\n");
  }

  public String Action_Input(){
    throw new UnsupportedOperationException("The requested operation is not supported.");
  }

  public void Action_Perform(String res){
    Task task=new Task();
    if(task.input()==1){
      Kanban.tasks.add(task);
      System.out.println("\nAdded Successfully\n");
    }
    else 
      System.out.println("\nNot Added\n");
    return;
  }
  
}