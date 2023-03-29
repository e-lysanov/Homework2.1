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

    public void printInformation() {
        System.out.print("Имя студента " + nameOfStudent);
        System.out.print(", сила магии " + powerOfMagic);
        System.out.print(", расстояние трансгрессии " + transgressionDistance);
        System.out.print(", хитрость" + cunning);
        System.out.print(", решительность" + determination);
        System.out.print(", амбициозность" + ambition);
        System.out.print(", находчивость" + resourcefulness);
        System.out.print(", жажда власти " + lustForPower);
        System.out.println();
    }
}
