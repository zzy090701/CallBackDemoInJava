public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calcADD(int a, int b) {
        return a + b;
    }

    public void fillBlank(int a, int b) {
        int result = calcADD(a, b);
        System.out.println(name + "心算:" + a + "+" + b + "=" + result);
    }
}
