public class SuperCalculator {
    public void add(int a, int b, Student student) {
        int result = a + b;
        student.fillBlank(a, b, result);

    }
}
