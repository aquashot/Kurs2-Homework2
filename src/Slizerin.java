public class Slizerin extends HogwartsStudent {
    private final int cunning;
    private final int attentiveness;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slizerin(String name, int magicPower, int transgressionDistance, int cunning, int attentiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.attentiveness = attentiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void innerComparyTO(Slizerin other) {
        if (skillSum() > other.skillSum()) {
            System.out.println(getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) {
            System.out.println(other.getName() + "сильнее чем " + getName());
        } else {
            System.out.println(getName() + "и" + other.getName() + "равные по силе");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getAttentiveness() {
        return attentiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", attentiveness=" + attentiveness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    private int skillSum() {
        return cunning + attentiveness + ambition + resourcefulness + thirstForPower;
    }
}


