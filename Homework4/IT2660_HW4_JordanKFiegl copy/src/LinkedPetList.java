import java.io.*;


public class LinkedPetList {

    private Pet root;
    private Pet last;
    private int size;


    public LinkedPetList(Pet pet){
        root = pet;
        last = pet;
        size = 1;
    }


    public void insertPetAtPosition(Pet newPet, int position) {

        if (position == 0) newRoot(newPet);
        else if (position == getListSize()) append(newPet);
        else insert(newPet, position);

    }

    private void insert(Pet newPet, int index){
        Pet targetPet = getPet(index - 1, false);
        newPet.setNextPet(targetPet.getNextPet());
        targetPet.setNextPet(newPet);
        size++;
    }


    public Pet getPetAtPosition(int position) {
        Pet walker = root;
        for (int i = 0; i < position; i++) {
            walker = walker.getNextPet();
        }
        return walker;
    }




    public void removePetAtPosition(int p) {
        // Deleting from an empty list
        if (getPetAtPosition(0) == null) {
            return;
        }

        Pet temp = root;


        // Non - edge case: overwrite p.next to be the .next.next value
        for (int i = 0; temp != null && i < p - 1; i++)
            temp = temp.getNextPet();


        // If there is a break in the link already, can't do anything
        if (temp == null || temp.getNextPet() == null)
                return;

            // Store value of node beyond temp.next (to be deleted) as the value of .next
        Pet next = temp.getNextPet().getNextPet();

        temp.setNextPet(next);

    }


    public void append(Pet pet) {
        last.setNextPet(pet);
        last = pet;
        size++;
    }

    private void newRoot(Pet pet) {
        pet.setNextPet(root);
        root = pet;
        size++;
    }

    private int getListSize() {
        int listSize = 1;
        Pet walker = root;
        while (walker.getNextPet() != null) {
            walker = walker.getNextPet();
            listSize++;
        }
        return listSize;
    }

    public void printPets() {
        Pet walker = root;
        System.out.print("[" + walker.getName() + "] ");
        while (walker.getNextPet() != null) {
            walker = walker.getNextPet();
            System.out.print("[" + walker.getName() + "] ");
        }
    }

//    public void print() {
//        System.out.println("List Size: [" + size + "]");
//        getPet(size, true);
//    }

    private Pet getPet(int position, boolean shouldPrint)  {

        Pet walker = root;

        for (int i=1; i<=position; i++) {
            if (shouldPrint) {
                System.out.print(walker.getName() + " ");
            }
            walker = walker.getNextPet();
        }

        return walker;
    }
}
