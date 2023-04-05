public class CowImpl implements Animal {
    private byte age;

    @Override
    public void sound() {
        System.out.println("Bů!");
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
        return "CowImpl{" +
                "age=" + age +
                '}';
    }
}