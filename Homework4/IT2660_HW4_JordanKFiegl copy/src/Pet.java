public class Pet {
    private String name;
    private Pet next;

    Pet(String n) {
        this.name = n;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public Pet getNextPet() {
        return this.next;
    }

    public void setNextPet(Pet pet) {
        this.next = pet;
    }

    public void printPetName(){
        System.out.println(name);
    }


}


