public class CustomerQueue {

    private int capacity;
    Customer buffetLine[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;


    public CustomerQueue(int size){
        this.capacity = size;
        this.buffetLine = new Customer[capacity];
    }



    public void enqueue(Customer customer){
        if( isQueueFull()){
            System.out.println("Queue is full. Increasing capacity...");
            increaseCapacity();
        }
        rear++;
        if (rear >= this.capacity && currentSize != this.capacity){
            rear = 0;
        }
        buffetLine[rear] = customer;
        currentSize++;
        System.out.println("Adding: " + customer.getName());
    }

    public void dequeue() throws Exception{
        if (isQueueEmpty()){
            throw new Exception("Queue is empty. Cannot remove element.");
        }
        else{
            front++;
            if (front > capacity -1) {
                System.out.println("Removed: " + buffetLine[front - 1].getName());
                front = 0;
            }
            else{
                System.out.println("Removed: " + buffetLine[front - 1].getName());
            }
            currentSize--;
        }

    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }


    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == buffetLine.length) {
            status = true;
        }
        return status;
    }

    private void increaseCapacity(){

        //create new array with double size as the current one.
        int newCapacity = this.capacity*2;
        Customer[] temp = new Customer[newCapacity];
        //copy elements to new array, copy from rear to front
        int tmpFront = front;
        int index = -1;
        while(true){
            temp[++index] = this.buffetLine[tmpFront];
            tmpFront++;
            if(tmpFront == this.capacity){
                tmpFront = 0;
            }
            if(currentSize == index+1){
                break;
            }
        }
        //make new array as queue
        this.buffetLine = temp;
        System.out.println("New array capacity: "+this.buffetLine.length);
        //reset front & rear values
        this.front = 0;
        this.rear = index;
    }
}
