public class Main {

    public static void main(String[] args){
        Pet head = new Pet("");
        Pet honey = new Pet("Honey");
        Pet einstein = new Pet("Einstein");
        Pet tito = new Pet("Tito");
        Pet diego = new Pet("Diego");

        honey.setNextPet(einstein);
        honey.getNextPet().setNextPet(tito);
        honey.getNextPet().getNextPet().setNextPet(diego);


        honey.recursivePrint(honey);

    }

}
