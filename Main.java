import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("身長を入力してください。");
	double height = s.nextDouble();
	System.out.println("体重を入力してください。");	
	double weight = s.nextDouble();

	double bmi = weight / (height*height);

	System.out.println("BMIの数値は" + ((Math.floor(bmi*100))/100) + "です。");
  }
}
