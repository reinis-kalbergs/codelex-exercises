package io.codelex.classesandobjects.exercises.exercise7;

public class Dog {
    public enum gender{
        MALE,
        FEMALE
    }
    private String name;
    private gender sex;
    private Dog father;
    private Dog mother;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public gender getSex() {
        return sex;
    }

    public void setSex(gender sex) {
        this.sex = sex;
    }

    public String fathersName() {
        if (this.father == null) {
            return "Unknown";
        }
        return this.father.getName();
    }

    public Dog(String name, gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog getFather() {
        return father;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public void setParents(Dog mother, Dog father) {
        setMother(mother);
        setFather(father);
    }

    public Dog getMother() {
        return mother;
    }

    public boolean hasSameMotherAs(Dog possibleSibling) {
        if (this.mother == null || possibleSibling.getMother() == null) return false; // No mothers found.
        return (this.mother.equals(possibleSibling.getMother()));
    }
}
