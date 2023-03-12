package Features;

import Task.*;

public class DisplayTodoTasks extends DisplayTasks {
  public void Action_Perform(String res){
    for (Task task : Kanban.tasks) { 		      
      if(task.getStartStatus()=="false")
        task.display(); 		
    }
  }
}