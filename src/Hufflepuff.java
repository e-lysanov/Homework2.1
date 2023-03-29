public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String nameOfStudent, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(nameOfStudent, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printInformation() {
        System.out.print("Имя студента " + nameOfStudent);
        System.out.print(", сила магии " + powerOfMagic);
        System.out.print(", расстояние трансгрессии " + transgressionDistance);
        System.out.print(", трудолюбие " + industriousness);
        System.out.print(", верность " + loyalty);
        System.out.print(", честность " + honesty);
        System.out.println();
    }

}
