import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    System.out.println("Podaj wzrost w cm:");
    int wzrost = Integer.parseInt(new Scanner(System.in).nextLine());

    System.out.println("Podaj wage w kg:");
    int waga = Integer.parseInt(new Scanner(System.in).nextLine());
  }

  private static void wyliczBMI(double wzrost, double waga)
  {
    double BMI = wzrost / (waga * waga);
    System.out.printf("Twój wskaźnik BMI to: %1$s \r\n", BMI);
  }
}
