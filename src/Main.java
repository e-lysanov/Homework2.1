public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 88, 88, 88, 88, 88);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 88, 88, 88, 88, 88);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 88, 88, 88, 88, 88);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 70, 70, 70, 70, 70);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 70, 70, 70, 70, 70);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 70, 70, 70, 70, 70);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 73, 73, 73, 73, 73, 73);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 73, 73, 73, 73, 73, 73);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 73, 73, 73, 73, 73, 73);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 80, 80, 80, 80, 80, 80);
        Slytherin grahamMontagu = new Slytherin("Грэхом Монтегю", 80, 80, 80, 80, 80, 80, 80);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 80, 80, 80, 80, 80, 80, 80);

        harryPotter.printInformation();
        cedricDiggory.printInformation();
    }
}