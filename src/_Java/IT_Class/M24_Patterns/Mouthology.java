package _Java.IT_Class.M24_Patterns;

public class Mouthology {
    public static void main(String[] args) {
        Person.Builder builderProfessor = Person.builder();

        Person professor = builderProfessor
                .setProfession("professor")
                .setBiology(true)
                .setMouthology(true)
                .setEcology(true)
                .setZoology(true)
                .getPerson();
        System.out.println(professor.isBiology());

        professor = builderProfessor.setEcology(true).getPerson();
        System.out.println(professor.isEcology());

        Person sailor = Person.builder()
                .setCrocodilogy(true)
                .getPerson();
        System.out.println(sailor.isCrocodilogy());
    }
}

class Person {
    private String profession = "";
    private boolean biology = false;
    private boolean ecology = false;
    private boolean zoology = false;
    private boolean geography = false;
    private boolean physiology = false;
    private boolean swiminology = false;
    private boolean escapology = false;
    private boolean sharkology = false;
    private boolean crocodilogy = false;
    private boolean assology = false;
    private boolean headology = false;
    private boolean mouthology = false;

    public static Builder builder() {
        return new Person().new Builder();
    }

    public String getProfession() {
        return profession;
    }

    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isZoology() {
        return zoology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isPhysiology() {
        return physiology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isSharkology() {
        return sharkology;
    }

    public boolean isCrocodilogy() {
        return crocodilogy;
    }

    public boolean isAssology() {
        return assology;
    }

    public boolean isHeadology() {
        return headology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public class Builder {
        private Builder() {
        }

        public Builder setProfession(String profession) {
            Person.this.profession = profession;
            return this;
        }

        public Builder setBiology(boolean biology) {
            Person.this.biology = biology;
            return this;
        }

        public Builder setEcology(boolean ecology) {
            Person.this.ecology = ecology;
            return this;
        }

        public Builder setZoology(boolean zoology) {
            Person.this.zoology = zoology;
            return this;
        }

        public Builder setGeography(boolean geography) {
            Person.this.geography = geography;
            return this;
        }

        public Builder setPhysiology(boolean physiology) {
            Person.this.physiology = physiology;
            return this;
        }

        public Builder setSwiminology(boolean swiminology) {
            Person.this.swiminology = swiminology;
            return this;
        }

        public Builder setEscapology(boolean escapology) {
            Person.this.escapology = escapology;
            return this;
        }

        public Builder setSharkology(boolean sharkology) {
            Person.this.sharkology = sharkology;
            return this;
        }

        public Builder setCrocodilogy(boolean crocodilogy) {
            Person.this.crocodilogy = crocodilogy;
            return this;
        }

        public Builder setAssology(boolean assology) {
            Person.this.assology = assology;
            return this;
        }

        public Builder setHeadology(boolean headology) {
            Person.this.headology = headology;
            return this;
        }

        public Builder setMouthology(boolean mouthology) {
            Person.this.mouthology = mouthology;
            return this;
        }

        public Person getPerson() {
            return Person.this;
        }
    }
}