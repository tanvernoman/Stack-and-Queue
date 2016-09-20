/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueuealgorithm;

/**
 *
 * @author afnan
 */
public class Queue {
    
    private int[] q;
    private int N;
    private int head;
    private int tail;

    public Queue(Integer maxN)
    {
        q= new int[maxN+1];
        N= maxN+1;
        head=N;
        tail=0;
        
        System.out.println("-----------[ctor] N "+N
                        +"head "+ head
                        +"tail "+ tail
                        +"maxN "+maxN
                        );
    }//end constructor
    
    protected int getHead()
    {
        return head;
    }
    protected int getTail()
    {
        return tail;
    }
    protected int getN()
    {
        return N;
    }
    
    public boolean isEmpty()
    {
        return head% N==tail;
    }
    public boolean isFull()
    {
        return tail+1==head;
    }
    public void put(Integer item)
    {
        q[tail++]=item;
        tail=tail%N;
    }
    
    public int get()
    {
        head=head%N;
        return q[head++];
    }
    public void showIndices()
    {
        System.out.println("-------------->head (index) :"+
                getHead() + "   "
                +"tail(index) : "+getTail()+"   "
                +" N :" +getN()+ "   "
                );
    }
    
    public Queue display()
    {
        int count =(tail+N-head)% N;
        for(int i=0; i<count; i++)
        {
            int index=(head+i)%N;
            System.out.println(q[index]);
        }
        return this;
    }
}
