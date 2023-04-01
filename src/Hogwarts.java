public abstract class Hogwarts {
    private String nameOfStudent;
    private int powerOfMagic;
    private int transgressionDistance;


    public Hogwarts(String nameOfStudent, int powerOfMagic, int transgressionDistance) {
        this.nameOfStudent = nameOfStudent;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    protected int getAbilitiesSum() {
        return powerOfMagic + transgressionDistance;
    }
    public static void compare(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstStudentSum = firstStudent.getAbilitiesSum();
        int secondStudentSum = secondStudent.getAbilitiesSum();

        if (firstStudentSum > secondStudentSum) {
            System.out.println(firstStudent.getNameOfStudent() + " лучший студент Хогвартса, чем " + secondStudent.getNameOfStudent());
        } else if (firstStudentSum < secondStudentSum) {
            System.out.println(secondStudent.getNameOfStudent() + " лучший студент Хогвартса, чем " + firstStudent.getNameOfStudent());
        } else {
            System.out.println("Студенты Хогвартса " + firstStudent.getNameOfStudent() + " и " + secondStudent.getNameOfStudent() + " одинаково хороши");
        }
    }

}

