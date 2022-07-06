public class Main {
    public static void main(String[] args) {

        int a  = 3572; // стоимость билета
        int b = 20; // рублей для одной мили в (1 миля = 20 рублей со стоимости билета)
        int c = a / b; // количество бонусных миль

        System.out.println(c + " бонусных миль");

    }
}