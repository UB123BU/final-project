import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
  public static void main(String[] args) {
    
    System.out.println("Podaj wzrost w cm:");
    int wzrost = Integer.parseInt(new Scanner(System.in).nextLine());

    System.out.println("Podaj wage w kg:");
    int waga = Integer.parseInt(new Scanner(System.in).nextLine());
  }

  private static void wyliczBMI(double wzrost, double waga)
  {
    double BMI = waga / ((wzrost / 100) * (wzrost / 100));
    System.out.printf("Twój wskaźnik BMI to: %1$s \r\n", BMI);
  }
}

class BMICalculatorTest {
    @Test
    void testCalculateBMI_1() {
        double wzrost = 175;
        double waga = 70;
        double expectedBMI = 22.86;
        double BMI = BMI(wzrost, waga);
        assertEquals(expectedBMI, BMI, 0.01);
    }
    @Test
    void testCalculateBMI_2() {
        double wzrost = 165;
        double waga = 50;
        double expectedBMI = 18.36;
        double BMI = BMI(wzrost, waga);
        assertEquals(expectedBMI, BMI, 0.01);
    }
    @Test
    void testCalculateBMI_3() {
        double wzrost = 180;
        double waga = 90;
        double expectedBMI = 27.78;
        double BMI = BMI(wzrost, waga);
        assertEquals(expectedBMI, BMI, 0.01);
    }
    }
