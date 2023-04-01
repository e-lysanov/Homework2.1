public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String nameOfStudent, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(nameOfStudent, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return getNameOfStudent() +  ": факультет Слизерин" +
                ", сила магии " + getPowerOfMagic() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + lustForPower;
    }
    @Override
    protected int getAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public static void compare(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentSum = firstStudent.getAbilitiesSum();
        int secondStudentSum = secondStudent.getAbilitiesSum();

        if (firstStudentSum > secondStudentSum) {
            System.out.println(firstStudent.getNameOfStudent() + " лучший слизеринец, чем " + secondStudent.getNameOfStudent());
        } else if (firstStudentSum < secondStudentSum) {
            System.out.println(secondStudent.getNameOfStudent() + " лучший слизеринец, чем " + firstStudent.getNameOfStudent());
        } else {
            System.out.println("Слизеринцы " + firstStudent.getNameOfStudent() + " и " + secondStudent.getNameOfStudent() + " одинаково хороши");
        }
    }
}
