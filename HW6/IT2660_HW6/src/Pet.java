public class Pet {

    private String name;
    private Pet next;


    Pet(String name) {this.name = name;}

    public String getName() {
        return name;
    }



    public Pet getNextPet() {return this.next;}

    public void setNextPet(Pet pet) {this.next = pet;}

    private Pet getPetAtPosition(int position) {
        Pet walker = this;
        for (int i=0; i<position; i++) {
            walker = walker.getNextPet();
        }
        return walker;
    }

    private int getListSize() {
        int listSize = 1;
        Pet walker = this;
        while (walker.getNextPet() != null) {
            walker = walker.getNextPet();
            listSize++;
        }
        return listSize;
    }



    private Pet append(Pet pet) {
        Pet lastPet = getPetAtPosition(getListSize()-1);
        lastPet.setNextPet(pet);
        return this;
    }

    public void recursivePrint(Pet pet){
        Pet temp = this;
        if (pet == null) return;

        System.out.println(pet.getName());
        recursivePrint(pet.next);




    }


}
