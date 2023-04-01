public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 60, 70, 30, 100, 70);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 90, 100, 90, 100);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 40, 40, 65, 30, 60);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 72, 64, 30, 30, 70);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 45, 62, 73, 29, 78);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 46, 56, 60, 68, 55);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 73, 66, 70, 73, 80, 73);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 73, 80, 73, 67, 73, 73);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 73, 49, 65, 90, 73, 73);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 81, 85, 60, 90, 80, 100);
        Slytherin grahamMontagu = new Slytherin("Грэхом Монтегю", 80, 90, 80, 80, 60, 80, 80);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 80, 66, 60, 90, 80, 80, 73);

        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);

        Gryffindor.compare(harryPotter, hermioneGranger);
        Hufflepuff.compare(zachariahSmith, cedricDiggory);

        Hogwarts.compare(grahamMontagu, zhouChang);
        Hogwarts.compare(ronWeasley, padmaPatil);
    }
}