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

    @Override
    public String toString() {
        return getNameOfStudent() + ": факультет Пуффендуй" +
                ", сила магии " + getPowerOfMagic() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", трудолюбие " + industriousness +
                ", верность " + loyalty +
                ", честность " + honesty;
    }

    @Override
    protected int getAbilitiesSum() {
        return industriousness + loyalty + honesty;
    }
    public static void compare(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentSum = firstStudent.getAbilitiesSum();
        int secondStudentSum = secondStudent.getAbilitiesSum();

        if (firstStudentSum > secondStudentSum) {
            System.out.println(firstStudent.getNameOfStudent() + " лучший пуффендуец, чем " + secondStudent.getNameOfStudent());
        } else if (firstStudentSum < secondStudentSum) {
            System.out.println(secondStudent.getNameOfStudent() + " лучший пуффендуец, чем " + firstStudent.getNameOfStudent());
        } else {
            System.out.println("Пуффендуйцы " + firstStudent.getNameOfStudent() + " и " + secondStudent.getNameOfStudent() + " одинаково хороши");
        }
    }


}
