public class Puffenduy extends HogwartsStudent {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Puffenduy(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void innerComparyTO(Puffenduy other) {
        if (skillSum() > other.skillSum()) {
            System.out.println(getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) {
            System.out.println(other.getName() + "сильнее чем " + getName());
        } else {
            System.out.println(getName() + "и" + other.getName() + "равные по силе");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    private int skillSum() {
        return hardworking + loyal + honest;
    }
}
