import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.print("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");
	double height = s.nextDouble();
	System.out.print("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");	
	double weight = s.nextDouble();
	System.out.print("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");
	double height2 = s.nextDouble();
	System.out.print("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");
	double weight2 = s.nextDouble();
	double bmi = weight / (height*height);
	double bmi2 = weight2 / (height*height);
	System.out.println("¿¿¿¿BMI¿¿¿¿" + ((Math.floor(bmi*100))/100) + "¿¿¿");
	System.out.println("¿¿¿¿BMI¿¿¿¿" + ((Math.floor(bmi*100))/100) + "¿¿¿");
  }
}
