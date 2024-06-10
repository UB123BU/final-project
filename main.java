public class Main {
  public static void main(String[] args) {
    double wzrost = 170;
    double waga = 80;
    double BMI = (waga / ((wzrost / 100) * (wzrost / 100)));
System.out.println("Twój wskaźnik BMI to:" + BMI);
    emailext body: "Twój wskaźnik BMI to: $BMI",          subject: "Wynik BMI",          to: "k.kapitula.063@studms.ug.edu.pl";
  }}
