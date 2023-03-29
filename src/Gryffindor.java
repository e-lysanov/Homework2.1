public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String nameOfStudent, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(nameOfStudent, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Имя студента " + nameOfStudent +
                ", сила магии " + powerOfMagic +
                ", расстояние трансгрессии " + transgressionDistance +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery;
    }

    public void printInformation() {
        System.out.print("Имя студента " + nameOfStudent);
        System.out.print(", сила магии " + powerOfMagic);
        System.out.print(", расстояние трансгрессии " + transgressionDistance);
        System.out.print(", благородство " + nobility);
        System.out.print(", честь " + honor);
        System.out.print(", храбрость " + bravery);
        System.out.println();
    }
}
