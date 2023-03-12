package Features;

import Task.*;
import java.util.*;
public class DisplayBacklogTasks extends DisplayTasks {
  public void Action_Perform(String res){
    for (Task task : Kanban.tasks) { 		      
      Date date = Calendar.getInstance().getTime();
      if(task.BacklogStatus()==true)
        task.display(); 		
    }
  }
}