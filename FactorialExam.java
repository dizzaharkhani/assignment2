class FactorialExam {
    int i, fact = 1;
    int number = 5;

    void display() {
        for (i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of " + number + " is " + fact);

    }

    public static void main(String[] args) {
        FactorialExam f = new FactorialExam();
        f.display();

    }
}