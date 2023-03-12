package Task; 

import java.util.*;
import java.text.*;

public class Task{
  private String Task;
  private Date Deadline;
  private Date Completion;
  private String Status;
  private String StartStatus;

  public String getTask(){
    return Task;
  }
  public Date getDeadline(){
    return Deadline;
  }
  public Date getCompletion(){
    return Completion;
  }
  public String getStatus(){
    return Status;
  }
  public String getStartStatus(){
    return StartStatus;
  }
  public void setTask(String Task){
    this.Task = Task;
  }
  public void setDeadline(Date Deadline){
    this.Deadline=Deadline;
  }
  public void setCompletion(Date Completion){
    this.Completion=Completion;
  }
  public void setStatus(String Status){
    this.Status = Status;
  }
  public void setStartStatus(String StartStatus){
    this.StartStatus = StartStatus;
  }

  public String toString(){
    SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
    String deadline = dateformat.format(Deadline);
    String completion = dateformat.format(Completion);
    if(Status=="false")
     completion="null";
    
    return Task + " " + deadline + " " + completion + " " + Status + " " + StartStatus + "\n";
  }

  public int input() {
    try {
      Completion = Calendar.getInstance().getTime();  ;
      Status = "false";
      StartStatus = "false";
      Scanner input = new Scanner(System.in);
      System.out.println("\nTASK INPUT\n");
      System.out.println("Enter Task:");
      Task = input.nextLine();
      SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Enter deadline (dd/MM/yyyy):");
      String dateinput = input.nextLine();
      if(null != dateinput && dateinput.trim().length() > 0){
        Deadline = dateformat.parse(dateinput);
      }
    }
    catch(ParseException e){
      System.out.println("Error occured in reading!");
      return 0;
    }
    return 1;
  }
    public void display(){
    try{
      System.out.print("\n----------------------------------\n");
      System.out.println("Task:" + Task);
      SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("To be completed on: " + dateformat.format(Deadline));
      if(StartStatus.equals("true"))
        System.out.println("Started.");
      else 
        System.out.println("Not yet Started.");
      
      if(Status.equals("true"))
        System.out.println("Completed on: " + dateformat.format(Completion));
      else 
        System.out.println("Incomplete");
      if(BacklogStatus())
        System.out.println("TASK IS DUE");
      if(LateStatus())
        System.out.println("LATE COMPLETION");
      System.out.print("\n---------------------------------\n");
    }
    catch(NullPointerException e){
      System.out.println("Error occured in printing!");
    }
  }

  public void Start(){
    StartStatus = "true";
  }

  public void Complete(){
    if(StartStatus.equals("false")){
      System.out.println("Cant complete that which hasnt already started xD");
      return;
    }
    Date date = Calendar.getInstance().getTime();  
    Completion = date;
    Status="true";
  }

  public boolean BacklogStatus(){
      Date date = Calendar.getInstance().getTime();
      return getStatus().equals("false") && date.after(getDeadline());
  }

  public boolean LateStatus(){
      Date date = getCompletion();
      if(getStatus().equals("false"))
        return false;
      return date.after(getDeadline());
  }
}