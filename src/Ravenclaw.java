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

    @Override
    public String toString() {
        return getNameOfStudent() + ": факультет Когтевран" +
                ", сила магии " + getPowerOfMagic() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", разум " + mind +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + creation;
    }

    @Override
    protected int getAbilitiesSum() {
        return mind + wisdom + wit + creation;
    }
    public static void compare(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentSum = firstStudent.getAbilitiesSum();
        int secondStudentSum = secondStudent.getAbilitiesSum();

        if (firstStudentSum > secondStudentSum) {
            System.out.println(firstStudent.getNameOfStudent() + " лучший когтевранец, чем " + secondStudent.getNameOfStudent());
        } else if (firstStudentSum < secondStudentSum) {
            System.out.println(secondStudent.getNameOfStudent() + " лучший когтевранец, чем " + firstStudent.getNameOfStudent());
        } else {
            System.out.println("Когтевранцы " + firstStudent.getNameOfStudent() + " и " + secondStudent.getNameOfStudent() + " одинаково хороши");
        }
    }

}
