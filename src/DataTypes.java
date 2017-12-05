/**
 * Created by Sfill on 07.07.2016.
 */
public class DataTypes {
    public static void main(String[] args) {
        char letter = 'M';
        String title = "Java";
        int num = 365;
        float dec = 98.6f;
        boolean res = true;
        System.out.println("Буква " + letter);
        System.out.println("Название " + title);
        System.out.println("Количество " + num);
        System.out.println("Температура " + dec);
        System.out.println("Ответ " + res);
        final int ABS = 29;
        final int CDE = 1024;
        int total = ABS * num + CDE;
        System.out.println("Итого " + total);
        int a = num % ABS;
        float b = dec / 21;
        System.out.println("По модулю " + a);
        System.out.println("деление " + b);
        b /= dec;
        System.out.println("делитьРавно " + b);
        boolean state = ABS < CDE;
        System.out.println("'" + state + "'");
        System.out.println((6 + 4));

        boolean yes = true;
        boolean no = false;
        System.out.println("Результат проверки " + (yes && yes));
        System.out.println("Результат проверки2 " + (yes && no));
        System.out.println("Результат проверки3 " + (yes || no));

        int nm = 1297;
        String result;
        result = (nm % 2 != 0) ? "Нечет" : "Чет";
        System.out.println(result);

        double rd = 2034;
        double dr = rd / CDE; // Для получения добного результата, хотя бы одна переменная должна быть double
        System.out.println(dr);
        System.out.println("Изменение файла");
    }
    }
