package kata4.model;


public class Mail {
    String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDominio(){
        int index = mail.indexOf("@");
        return mail.substring(index, mail.length());
    }
}
