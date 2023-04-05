public class PigImpl implements Animal {
    private byte age;

    @Override
    public void sound() {
        System.out.println("Oink!");
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
        return "PigImpl{" +
                "age=" + age +
                '}';
    }
}