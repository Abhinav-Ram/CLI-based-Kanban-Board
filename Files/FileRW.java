package Files;

import Task.*;
import java.io.FileWriter; 
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.*;
import java.util.*;

public class FileRW{
  public static void ArrayToFile(String FName){
     try {
      FileWriter myWriter = new FileWriter("output.txt");
      for(Task task: Kanban.tasks){
        String temp=task.toString(); 
        myWriter.write(temp);
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
  }
  public static void FileToArray(String FName){
    try {
      File file = new File(FName);
      file.createNewFile();
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine(); 
        String[] Objdata=data.split(" ");
        Task task=new Task();
        task.setTask(Objdata[0]);
        task.setStatus(Objdata[3]);
        task.setStartStatus(Objdata[4]);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        task.setDeadline(dateformat.parse(Objdata[1]));
        if(task.getStatus().equals("false"))
          task.setCompletion(Calendar.getInstance().getTime());
        else
          task.setCompletion(dateformat.parse(Objdata[2]));
        Kanban.tasks.add(task);
          
      }
      myReader.close();
    } catch (ParseException e) {
      System.out.println("An date error occurred.");
    } catch (Exception e) {
      System.out.println("An error occurred.");
    }
  }
}

