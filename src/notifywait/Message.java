/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifywait;

/** 
 *
 * @author DuyTuan
 */
public class Message {
    private String msg;
    
    public Message(String str){
        this.msg = str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String infoMessage(String out){
        return out;
    }
    public void displayMessage(){
        System.out.println(msg);
    }
}
