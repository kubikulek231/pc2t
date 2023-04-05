public class DogImpl implements Animal {
    private byte age;

    @Override
    public void sound() {
        System.out.println("Haf!");
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
        return "DogImpl{" +
                "age=" + age +
                '}';
    }
}