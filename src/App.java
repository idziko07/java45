import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        List<Double> numbers = new ArrayList<>();
        double num;
        do {
            System.out.println("Podaj liczbe: ");
            num = input.nextDouble();
            if(num > 0 )
                numbers.add(num);
        }while (num > 0);

        System.out.println(numbers.toString());
        if(numbers.size() > 1) {
            reversArray(numbers);
            sum(numbers);
            minAndMax(numbers);
        }else {
            System.out.println("lista powinna zawierać przynajmniej dwie liczby!!!");
        }
        
    }

    public static void reversArray(List<Double> numbers){
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if(i == 0){
                System.out.println(numbers.get(i));
            }else {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }

    public static void sum(List<Double> numbers){
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
            if(i == numbers.size()-1) {
                System.out.print(numbers.get(i) + " = " + sum + "\n");
            }else {
                System.out.print(numbers.get(i) + " + ");
            }
        }

    }

    public static void minAndMax(List<Double> numbers){
        double min = numbers.get(0);
        double max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(min > numbers.get(i))
                min = numbers.get(i);
            if(max < numbers.get(i))
                max = numbers.get(i);
        }
        System.out.println("Najmniejsza liczba listy to: " + min + " a najwieksza to: " + max);
    }
}
