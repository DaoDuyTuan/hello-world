/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifywait;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuyTuan
 */
public class Waiter implements Runnable {
    private Message msg;
    
    public Waiter(Message m){
        this.msg = m;
    }
    public Message getMsg() {
        return msg;
    }
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized(msg){
            try {

                System.out.println(name+"waiting to get notified at time : "+System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println(name+"waiter thread got notified at time"+System.currentTimeMillis());
        System.out.println(name+" processed: "+msg.getMsg());
    }
    
}
