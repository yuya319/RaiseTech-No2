package chapter01;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = chapter01.CalcLogic.tasu(a, b);
		int delta = chapter01.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);
	}
}
