public class LawFirm {

    private Lawyer[] firm;
    private int count;
    private int sizeOfArray;


    // Blank Constructor to initiate null Law Firm
    public LawFirm(){
        this.firm = new Lawyer[1];
        count = 0;
        sizeOfArray = 1;
    }

    // New Law firm with one lawyer added
    public LawFirm(Lawyer lawyer){
        this.firm = new Lawyer[2];
        count = 1;
        sizeOfArray = 2;
        this.firm[0] = lawyer;
    }

    // print function; primarily to demonstrate functionality
    public void print() {
        for (Lawyer lawyer: this.firm) {
            if(lawyer != null)
            { System.out.println(lawyer.getLawyerName());}
            else
            {System.out.println("NULL");}
        }
    }
    // Replace an existing node with new Lawyer
    // Copies array into temp array to protect from accidentally corrupting initial array
    public void replaceLawyer(Lawyer lawyer, int position){
        Lawyer temp[] = null;
        temp = new Lawyer[sizeOfArray];
        System.arraycopy(firm, 0, temp, 0, firm.length);
        temp[position] = lawyer;
        firm = temp;

    }
    // Add Lawyer to last index position
    public void addLawyer(Lawyer lawyer){
        if(count == sizeOfArray){
            growSize();
        }

        firm[count] = lawyer;
        count++;
    }
// Dynamic ability of array to grow to accommodate new nodes
    public void growSize(){
        Lawyer temp[] = null;
        if(count == sizeOfArray)
        {
            temp = new Lawyer[sizeOfArray + 1];
            {
                for (int i = 0; i < sizeOfArray; i++)
                {
                    temp[i] = firm[i];
                }
            }
        }
        firm = temp;
        sizeOfArray = sizeOfArray + 1;
    }
// Shrinks array as node(s) deleted
    public void shrinkSize(){
        Lawyer temp[] = null;
        if (count > 0)
        {
            temp = new Lawyer[count];

            System.arraycopy(firm, 0, temp, 0, count);
            sizeOfArray = count;
            firm = temp;
        }

    }

    // Removes node by index position, shrinks array to use minimal memory
    public void removeLawyerByIndex(int index){
        if (count > 0)
        {
            for (int i = index; i < count - 1; i++)
            {

                firm[i] = firm[i + 1];
            }
            count--;
            shrinkSize();
        }
    }
}


