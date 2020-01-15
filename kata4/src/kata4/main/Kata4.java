package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;

public class Kata4 {

    private static final String fileName = "email.txt";
    private static List <Mail> mailList;
    private static Histogram <String> histogram=new Histogram();
    private static HistogramDisplay histoDisplay;

    public static void main(String[] args) {
        execute();
    }
    
    private static void execute(){
        input();
        process();
        output();
    }
    
    private static void input(){
        MailListReader mlr = new MailListReader();
        mailList = mlr.read(fileName);
    }
    
    private static void process(){
        for (Mail m : mailList) {
            histogram.increment(m.getDominio());
        }
    }
    
    private static void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}