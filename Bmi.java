import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.print("真真真真真真真?");
	double height = s.nextDouble();
	System.out.print("真真真真真真真?");	
	double weight = s.nextDouble();
	System.out.print("真真真真真真真?");
	double height2 = s.nextDouble();
	System.out.print("真真真真真真真?");
	double weight2 = s.nextDouble();
	double bmi = weight / (height*height);
	double bmi2 = weight2 / (height*height);
	System.out.println("真真BMI真真" + ((Math.floor(bmi*100))/100) + "真?");
	System.out.println("真真BMI真真" + ((Math.floor(bmi*100))/100) + "真?");
  }
}
