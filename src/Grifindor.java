public class Grifindor extends HogwartsStudent{
    private final int nobility;
    private final int honor;
    private int bravery;

    public Grifindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void innerComparyTO(Grifindor other) {
        if (skillSum() > other.skillSum()) {
            System.out.println(getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) {
            System.out.println(other.getName() + "сильнее чем " + getName());
        } else {
            System.out.println(getName() + "и" + other.getName() + "равные по силе");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    private int skillSum(){
        return nobility+honor+bravery;
    }
}
