package boundedQueue;
import java.util.NoSuchElementException;


public class QueueX {
    private int maxsize; //size of the queue array
    private int[] queueArray;
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int nItems; //number of items in the queue
    
    public QueueX(int s) {
        maxsize = s;//set array size
        queueArray= new int[maxsize];
        front = 0;//index of the front element
        rear =-1;//index before the first elelemt
        nItems=0;//no items in the queue initially
    }
    
    //Enqueue operation
    public void enqueue(int j){
        if (isFull()){
            System.out.println("Queue is full");
        }else{
            rear++; //move rear forward
            queueArray[rear] = j; // insert the elements
            nItems++; // increment the item count 
        }
            
              
    }
    // dequeue operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return 0;
    }

    private boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
