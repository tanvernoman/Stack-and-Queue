/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueuealgorithm;

import java.io.IOException;

/**
 *
 * @author afnan
 */
public class StackAndQueueAlgorithm {

    /**
     * @param args the command line arguments
     */
    //Main for stack
    /*public static void main(String[] args) throws IOException {
        
        Stack s = new Stack(10); // 10 chars
    char ch;
    while ((ch = (char)System.in.read())!= '\n'){
       if (!s.full()){
           s.push(ch);
       }
    }
    while (!s.empty()){
       System.out.print(s.pop());
    System.out.println();
    }
    }*/
    //Main for queue 
    public static void main(String [] args)
    {
        int maxsize=5;
        int startValue=111;
        Queue q= new Queue(maxsize);
        int i= startValue;
        
        //fill the queue completely
        
        while(!q.isFull())
        {
            System.out.println(" [ fill ] value : "+ i);
            q.put(i);
            q.showIndices();
            i++;
        }
        
        q.get();
        System.out.println("[Get] has been executed ");
        q.showIndices();
        q.get();
        System.out.println("[Get] has been executed");
        q.showIndices();
        
        
        System.out.println("\n---------------------------- Currents element of the queue");
        q.display();
        System.out.println("\n -------------------------------------");
        
        q.put(12000);
        System.out.println("[put] 12001 -----------------");
        q.showIndices();
        
        
        q.get();
        System.out.println("[get] has been executed ");
        q.showIndices();
        
        
        System.out.println("\n--------------------------- current element of the queue");
        q.display();
        System.out.println("\n----------------------\n\n");
        
        
        q.put(12001);
        System.out.println(" [Put] 12001 ----------------");
        q.showIndices();
        
        
        q.get();
        System.out.println("[Get] has been executed ");
        q.showIndices();
        
        
        System.out.println("\n------------------------------current element of the queue");
        q.display();
        System.out.println("\n----------------------------------\n\n");
        
        
        q.get();
        System.out.println(" [Get] has been executed ");
        q.showIndices();
        
        
        q.get();
        System.out.println(" [Get] has been eecuted ");
        q.showIndices();
        
        
        System.out.println("\n--------------------current element of the queue -\n\n");
        q.display();
        System.out.println("\n-----------------------------------\n\n");
        
        
        while(!q.isFull())
        {
            System.out.println(" [ File ] value"+i);
            q.put(i);
            q.showIndices();
            i++;
        }
        System.out.println("\n----------------------------------current element of the queue 1/");
        q.display();
        System.out.println("\n --------------------------------\n");
        
        
        
        
    }
    
}
