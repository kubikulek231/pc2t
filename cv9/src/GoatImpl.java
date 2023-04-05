public class GoatImpl implements Animal {
    private byte age;

    @Override
    public void sound() {
        System.out.println("Bee!");
    }

    @Override
    public byte getAge() {
        return age;
    }

    @Override
    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GoatImpl{" +
                "age=" + age +
                '}';
    }
}