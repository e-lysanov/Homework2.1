public abstract class Hogwarts {
    protected String nameOfStudent;
    protected int powerOfMagic;
    protected int transgressionDistance;

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

    public void printInformation() {
        System.out.print("Имя студента " + nameOfStudent);
        System.out.print(", сила магии " + powerOfMagic);
        System.out.print(", расстояние трансгрессии " + transgressionDistance);
    }

}

