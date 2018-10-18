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

    public int useCalculator(int a, int b) {
        return new Calculator().add(a, b);

    }

    public void fillBlank(int a, int b) {
        int result = useCalculator(a, b);
        System.out.println(name + "用计算器计算:" + a + "+" + b + "=" + result);
    }
}
