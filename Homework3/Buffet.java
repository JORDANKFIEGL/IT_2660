public class Buffet {

    public static void main(String[] args) throws Exception{
        Plate lgPlate1 = new Plate("Large");
        Plate lgPlate2 = new Plate("Large");
        Plate lgPlate3 = new Plate("Large");
        Plate smPlate1 = new Plate("Small");
        Plate smPlate2 = new Plate("Small");
        Plate smPlate3 = new Plate("Small");

        PlateStack lgStack = new PlateStack(2);

        lgStack.push(lgPlate1);
        lgStack.push(lgPlate2);
        lgStack.push(lgPlate3); // Testing dynamic ability of array/Stack

        PlateStack smStack = new PlateStack(3);

        smStack.push(smPlate1);
        smStack.push(smPlate2);
        smStack.push(smPlate3);

        smStack.pop();
        smStack.pop();
        smStack.peek(); // testing peek.
        smStack.pop();
        try {smStack.pop();
        } catch (Exception e) {
        e.printStackTrace();}// Throws exception based off of underflow error.




        Customer john = new Customer("John");
        Customer anon = new Customer();
        Customer jordan = new Customer("Jordan");
        Customer tom = new Customer("Tom");



        CustomerQueue queue1 = new CustomerQueue(2);

        queue1.enqueue(john);
        queue1.enqueue(anon);
        queue1.enqueue(jordan); // Test dynamic ability of queue

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        try {
            queue1.dequeue();}
        catch (Exception ex){
            ex.printStackTrace();} // Underflow exception
    }
}
