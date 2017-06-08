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
public class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }
    
    
    public Message getMsg() {
        return msg;
    }
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        synchronized(msg){
            try {
                Thread.sleep(1000);
                msg.setMsg(name+"Notifier work done");
                msg.notify();
            } catch (InterruptedException ex) {
                Logger.getLogger(Notifier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
