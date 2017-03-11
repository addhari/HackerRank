/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialtrade1;

/**
 *
 * @author Harry
 */
public class FetchDetaisl extends Thread {

    public FetchDetaisl() {
    }
  
    void fetch()
    {
        String url="";
        String body="";
        String cookie="";
        new ChildThread(url, body, cookie).start();
    }
}
