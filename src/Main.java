import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Girmek İstediğiniz Sayı Miktarını Girin : ");
        int count = scanner.nextInt();
        int nums[] = new int[count];
        for(int i = 0; i < count; i++){
            System.out.print((i+1) + ". Sayıyı Gir : ");
            nums[i] = scanner.nextInt();
        }

        for(int i = 1; i < count; i++){
            int control = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > control){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = control;
        }

        for(int i = 0; i < count; i++){
            System.out.println(nums[i]);
        }
    }
}
