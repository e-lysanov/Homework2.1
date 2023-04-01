import java.util.Objects;

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
        return getNameOfStudent() + ": факультет Гриффиндор" +
                ", сила магии " + getPowerOfMagic() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery;
    }

    @Override
    protected int getAbilitiesSum() {
        return nobility + honor + bravery;
    }
    public static void compare(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentSum = firstStudent.getAbilitiesSum();
        int secondStudentSum = secondStudent.getAbilitiesSum();

        if (firstStudentSum > secondStudentSum) {
            System.out.println(firstStudent.getNameOfStudent() + " лучший гриффиндорец, чем " + secondStudent.getNameOfStudent());
        } else if (firstStudentSum < secondStudentSum) {
            System.out.println(secondStudent.getNameOfStudent() + " лучший гриффиндорец, чем " + firstStudent.getNameOfStudent());
        } else {
            System.out.println("Гриффиндорцы " + firstStudent.getNameOfStudent() + " и " + secondStudent.getNameOfStudent() + " одинаково хороши");
        }
    }

}
