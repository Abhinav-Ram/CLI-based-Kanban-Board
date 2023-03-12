import App.*;
import Files.FileRW;

public class Main{
  public static void main(String[] args){
    FileRW.FileToArray("output.txt");
    Message.OpeningMessage();
    Command C=new Command();
    C.InputCommand();
    Message.ClosingMessage();    
    FileRW.ArrayToFile("output.txt");
  }
}