import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("�g������͂��Ă��������B");
	double height = s.nextDouble();
	System.out.println("�̏d����͂��Ă��������B");	
	double weight = s.nextDouble();

	double bmi = weight / (height*height);

	System.out.println("BMI�̐��l��" + ((Math.floor(bmi*100))/100) + "�ł��B");
  }
}
