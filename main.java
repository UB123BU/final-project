public class Main {
  public static void main(String[] args) {
    double BMI;
    if (args.length == 2) {
        double wzrost = Double.parseDouble(args[0]);
        double waga = Double.parseDouble(args[1]);
        BMI = waga / ((wzrost / 100) * (wzrost / 100));
        System.out.println("Twój wskaźnik BMI to: " + BMI);
    } else {
        System.out.println("Please provide wzrost and waga as arguments.");
