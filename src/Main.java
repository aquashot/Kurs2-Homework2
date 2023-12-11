
public class Main {
    public static void main(String[] args) {
        Grifindor GarryPotter = new Grifindor("Гарри потер", 8, 9, 7, 1, 3);
        Grifindor Germiona = new Grifindor("Гермиона Гренджер", 7, 2, 3, 4, 2);
        Grifindor Ron = new Grifindor("Рон Уизли", 5, 3, 6, 8, 3);
        Slizerin Malfoy = new Slizerin("Драко Малфой", 7, 8, 4, 4, 3, 2, 7);
        Slizerin Grehem = new Slizerin("Грэхэм Монтегю", 7, 3, 6, 8, 2, 1, 2);
        Slizerin Gregory = new Slizerin("Грегори Гойл", 6, 2, 1, 3, 8, 6, 2);
        Puffenduy Smit = new Puffenduy("Захария Смит", 2, 5, 6, 3, 1);
        Puffenduy Sedrik = new Puffenduy("Седрик Диггори", 2, 3, 4, 5, 8);
        Puffenduy Justin = new Puffenduy("Джастин Финч-Флетчли", 7, 7, 8, 9, 1);
        Kogtevran Chang = new Kogtevran("Чжоу Чанг", 3, 2, 6, 7, 8,3);
        Kogtevran Padma = new Kogtevran("Падма Патил", 3, 6, 8, 7, 3, 1);
        Kogtevran Marcus = new Kogtevran("Маркус Белби", 2, 2, 3, 4, 5,3);
        Ron.innerComparyTO(Germiona);
        GarryPotter.compareTo(Malfoy);
        System.out.println(Chang);
    }
}
