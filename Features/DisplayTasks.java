package Features;

import Task.*;

public class DisplayTasks extends Action {
  public void Action_Info(){
    System.out.printf("\nDISPLAYING TASKS FROM THE BOARD\n");
  }

  public String Action_Input(){
    throw new UnsupportedOperationException("The requested operation is not supported.");
  }
  public void Action_Perform(String res){
    for (Task task : Kanban.tasks) { 		      
      task.display(); 		
    }
  }
}