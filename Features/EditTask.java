package Features;

import java.util.*;
import Task.*;

public class EditTask extends Action {
  public void Action_Info(){
    System.out.println("\nEDITING A TASK. Pls Enter the Task to Edit:\n");
  }
  public String Action_Input(){
    Scanner sc=new Scanner(System.in);
    String task = sc.nextLine();
    return task;
  }  
  public void Action_Perform(String res){
    for(int i=0;i<Kanban.tasks.size();i++){
      if(Kanban.tasks.get(i).getTask().equals(res)){
        System.out.println("\nTask Found. Now enter the edited info\n");
        Task task = new Task();
        task.input();
        Kanban.tasks.set(i,task);
        System.out.println("\nEdited Successfully\n");
        return;
      }
    }   
    System.out.println("\nTask cant be found\n");
      return;
  }
}