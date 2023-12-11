public class Kogtevran extends  HogwartsStudent{
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Kogtevran(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    public void innerComparyTO(Kogtevran other) {
        if (skillSum() > other.skillSum()) {
            System.out.println(getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) {
            System.out.println(other.getName() + "сильнее чем " + getName());
        } else {
            System.out.println(getName() + "и" + other.getName() + "равные по силе");

        }
        }
        @Override
        public String toString () {
            return super.toString() +
                    "smart=" + smart +
                    ", wise=" + wise +
                    ", witty=" + witty +
                    ", creativity=" + creativity +
                    '}';
        }
        private int skillSum () {
            return smart + wise + witty + creativity;
        }
    }