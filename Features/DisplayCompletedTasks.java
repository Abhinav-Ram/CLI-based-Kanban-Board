package Features;

import Task.*;

public class DisplayCompletedTasks extends DisplayTasks {
  public void Action_Perform(String res){
    for (Task task : Kanban.tasks) { 		      
      if(task.getStatus()=="true")
        task.display(); 		
    }
  }
}