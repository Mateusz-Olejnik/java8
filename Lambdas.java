package cwiczenia;

public class Lambdas {

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        double additionResult = executeOperation(3.0, 15.0, addition);
        System.out.println("Wynik operacji (a, b) -> a + b : " + additionResult);

        MathOperation subtraction = (a, b) -> a - b;
        double subtractionResult = executeOperation(15.0, 3.0, subtraction);
        System.out.println("Wynik operacji (a,b) -> a - b : " + subtractionResult);

        MathOperation multiplication = (a, b) -> a * b;
        double multiplicationResult = executeOperation(15.0, 3.0, multiplication);
        System.out.println("Wynik operacji (a,b) -> a*b : " + multiplicationResult);

        MathOperation division = (a, b) -> a / b;
        double divisionResult = executeOperation(15.0, 3.0, division);
        System.out.println("Wynik operacji (a,b) -> a/b : " + divisionResult);
    }

    static double executeOperation(double a, double b, MathOperation operation) {
        double result = operation.operate(a, b);
        return result;
    }
}
