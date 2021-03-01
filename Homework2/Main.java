import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        // Initializing lawyers to use for examples
        Lawyer johnSmith = new Lawyer("John Smith", 1500000, 3);
        Lawyer henryHill = new Lawyer("Henry Hill", 200000, 5);
        Lawyer charlieKelly = new Lawyer("Charles Kelly", 5000, 5);
        Lawyer jordanFiegl = new Lawyer("Jordan Fiegl", 10, 1);

        // demonstrating the blank initiation of blank Law Firm
        LawFirm firm1 = new LawFirm();

        // Adding a new lawyer to blank firm1
        firm1.addLawyer(new Lawyer("Jack Kelly", 10000, 10));
        firm1.print(); // testing; print will print "NULL" for blank array
                      //  positions, therefore tracks space allocation of array.

        LawFirm firm2 = new LawFirm(johnSmith); // New firm using non-blank constructor.
        firm2.addLawyer(charlieKelly); // adding lawyers to demonstrate dynamic array:
        firm2.addLawyer(henryHill);

        firm2.removeLawyerByIndex(0); // Removes lawyer johnSmith and shrinks array appropriately
        System.out.println("");
        firm2.print();

        firm2.addLawyer(johnSmith); // adding johnSmith back into array in last index position
        System.out.println("");
        firm2.print();

        firm2.replaceLawyer(jordanFiegl, 1); // replaces henryHill with jordanFiegl
        System.out.println("");
        firm2.print();


     }


}
