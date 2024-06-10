public class Main {
  public static void main(String[] args) {
    if (args.length == 2) {
        double wzrost = Double.parseDouble(args[0]);
        double waga = Double.parseDouble(args[1]);
        double BMI = waga / ((wzrost / 100) * (wzrost / 100));
        System.out.println("Twój wskaźnik BMI to: %1$s \r\n", BMI);
    } else {
        System.out.println("Please provide wzrost and waga as arguments.");
    }}}
