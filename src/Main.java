import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        info();
        randomizer();
    }

    public static void info(){
        String name, lastName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = scan.nextLine();
        System.out.println("Введите фамилию: ");
        lastName = scan.next();
        System.out.println("приветствую " + name + " " + lastName);

    }

    public static void randomizer(){
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько элементов должго быть в массиве: ");
        int RandomArr = scan.nextInt();
        int[] arr = new int[RandomArr];
        for (int i = 0; i<arr.length; i++) {
            int RandomNum = 10 + (int) (Math.random() * 100);
            arr[i] = RandomNum;
        }
        for (int j = 0; j<arr.length; j++){;
            if (arr[j]>num){
                num = arr[j];
            }
        }
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        System.out.println("Самое большое число в массиве: " + num);
    }
}