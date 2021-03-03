public class PlateStack {
    private int stackSize;
    private Plate[] platePile;
    private int top;


    public PlateStack(int size) {
        this.stackSize = size;
        this.platePile = new Plate[stackSize];
        this.top = -1;
    }

    public void push(Plate plate){
        if( this.isStackFull()) {
            System.out.println("Stack is full. Increasing the capacity.");
            this.increaseStackCapacity();
        }
        System.out.println("Adding: " + plate.getSize() + " Plate");
        this.platePile[++top] = plate;
    }

    public Plate pop() throws Exception{
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Cannot remove element.");
        }
        Plate entry = this.platePile[top--];
        System.out.println("Removed: " + entry.getSize() + " Plate.");
        return entry;
    }


    public Plate peek(){
        System.out.println("Top Plate is: " + platePile[top].getSize() + " Plate." );
        return platePile[top];
    }

    private void increaseStackCapacity(){
        Plate[] tempPile = new Plate[this.stackSize * 2];
        for(int i = 0; i < stackSize; i++) {
            tempPile[i] = this.platePile[i];
        }
        this.platePile = tempPile;
        this.stackSize = this.stackSize * 2;
    }

    public boolean isStackEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return( top == stackSize - 1);
    }


}
