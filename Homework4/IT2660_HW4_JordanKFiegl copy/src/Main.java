public class Main {

    public static void main(String[] args) {
        Pet jord = new Pet("Jordan");
        Pet ein = new Pet("Einstein");
        Pet tito = new Pet("Tito");
        Pet marty = new Pet("Marty");
        Pet nala = new Pet("Nala");

        LinkedPetList list1 = new LinkedPetList(jord);

        list1.append(ein);
        list1.append(tito);
        list1.insertPetAtPosition(marty, 1);
        list1.getPetAtPosition(1).printPetName();
        list1.printPets();
        System.out.println("");

        list1.append(nala);
        list1.removePetAtPosition(2);
        list1.printPets();
    }
}
