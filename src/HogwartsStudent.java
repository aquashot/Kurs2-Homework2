import java.awt.*;

public class HogwartsStudent {
    private final String Name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        Name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return Name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareTo(HogwartsStudent other) {
        if(skillSum()>other.skillSum()) {
            System.out.println(Name + "сильнее чем" + other.Name);
        }else if (skillSum()<other.skillSum()) {
            System.out.println(other.Name + "сильнее чем " + Name);
        }else {
            System.out.println(Name + "и" + other.Name + "равные по силе");
        }
        }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "Name='" + Name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    private int skillSum () {
            return magicPower + transgressionDistance;
        }
    }

