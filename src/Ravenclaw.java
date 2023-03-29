public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Ravenclaw(String nameOfStudent, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(nameOfStudent, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void printInformation() {
        System.out.print("Имя студента " + nameOfStudent);
        System.out.print(", сила магии " + powerOfMagic);
        System.out.print(", расстояние трансгрессии " + transgressionDistance);
        System.out.print(", ум " + mind);
        System.out.print(", мудрость" + wisdom);
        System.out.print(", остроумие" + wit);
        System.out.print(", творчество" + creation);
        System.out.println();
    }
}
