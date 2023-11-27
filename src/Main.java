public class Main {
    public static void main(String[] args) {
        creditPaymentService service = new creditPaymentService();
        int credit = 1_000_000; // сумма кредита
        int year = 3; // срок кредита в годах
        float pay = service.calculate(credit, year); // аннуитетный платеж
        int pay1 = (int) pay;
        System.out.println("Аннуитетный платеж = " + pay1);
    }
}