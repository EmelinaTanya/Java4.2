public class Main {
    public static void main (String[] args) {
        //BmiService service = new BmiService (); нет смысла создавать объект так как в классе только функция
        float weight = 100;
        float height = 1.93f;
        float bodyMileIndex = BmiService.calculate (height, weight);//вызов функции
        System.out.println(String.format("%.2f", bodyMileIndex)); //форматирование и вывод результата

    }
}

