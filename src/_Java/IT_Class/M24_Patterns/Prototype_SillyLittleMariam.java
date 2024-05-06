package _Java.IT_Class.M24_Patterns;

//prototype (порождающий шаблон)
public class Prototype_SillyLittleMariam {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam = (Girl)mariam.clone();
        noMariam.setName("No Mariam");
        noMariam.setLazy(false);
        noMariam.setSilly(false);
        System.out.println(noMariam.toString());
    }
}

class Girl implements Cloneable {
    private String name = "Mariam";
    private boolean silly = true;
    private boolean little = true;
    private boolean lazy = true;

    public Girl(String name) {
    }

    public String getName() {
        return name;
    }

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", little=" + little +
                ", lazy=" + lazy +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
}