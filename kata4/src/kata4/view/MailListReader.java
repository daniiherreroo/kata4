package kata4.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    
    public List<Mail> read (String fileName){
        List<Mail> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String currentLine;
            while((currentLine = br.readLine()) != null){
                if(currentLine.contains("@")){
                    list.add(new Mail(currentLine));
                }
            }            
        }catch(Exception e){
            
        }
        return list;
    }
}
