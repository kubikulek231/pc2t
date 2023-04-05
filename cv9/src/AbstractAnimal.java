public abstract class AbstractAnimal {
    private byte age;

    public abstract void sound();

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
