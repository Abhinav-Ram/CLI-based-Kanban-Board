package Features;

import Task.*;

public class DisplayInprogressTasks extends DisplayTasks {
  public void Action_Perform(String res){
    for (Task task : Kanban.tasks) { 		      
      if(task.getStartStatus()=="true" && task.getStatus()=="false")
        task.display(); 		
    }
  }
}