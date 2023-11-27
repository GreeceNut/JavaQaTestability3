public class creditPaymentService {
    public float calculate(int credit, int year) {
        int month = year * 12; // срок кредита в месяцах
        float yearPercent = 9.99F; // годовые проценты
        double coefficient1 = ((yearPercent / (100 * 12)) / (1 - (Math.pow(1 + (yearPercent / (100 * 12)), -month))));
        //(0.0999 * Math.pow(1+0.0999,month))/(Math.pow(1+0.0999,month)-1); // коэффициент аннуитета
        float coefficient = (float) coefficient1;
        float pay = credit * coefficient; // аннуитетный платеж
        return pay;
    }


}
