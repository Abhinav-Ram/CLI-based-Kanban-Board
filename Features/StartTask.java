package Features;

import java.util.*;
import Task.*;

public class StartTask extends Action {
  public void Action_Info(){
    System.out.println("\nSTARTING A TASK. Pls Enter the Task to Mark as started:\n");
  }
  public String Action_Input(){
    Scanner sc=new Scanner(System.in);
    String task = sc.nextLine();
    return task;
  }  
  public void Action_Perform(String res){
    for(int i=0;i<Kanban.tasks.size();i++){
      if(Kanban.tasks.get(i).getTask().equals(res)){
        System.out.println("\nTask Found\n");
        Task task = Kanban.tasks.get(i);
        task.Start();
        Kanban.tasks.set(i,task);
        System.out.println("\nDone\n");
        return;
      }
    }   
    System.out.println("\nTask cant be found\n");
      return;
  }
}