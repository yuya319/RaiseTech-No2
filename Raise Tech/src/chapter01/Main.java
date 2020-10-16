package chapter01;

//インターフェースの宣言
interface Communication{
    //メンバ変数(定数)
    public String STR = "Hello";
 
    //メソッド(型のみ宣言)
    void greet();
}
 
//インターフェースの実装
class Workplacecommunication implements Communication{
    // メソッドの実装 
    public void greet() {
    	boolean Workplace = false;
        System.out.println(STR);
        if (Workplace == true && STR.equals("Hello")) {
        	System.out.println("こんにちは");
        }
    }
}
 
//実行Mainクラス
public class Main {
 
    public static void main(String[] args) {
        Workplacecommunication wpc = new Workplacecommunication();
        wpc.greet(); //Hello
    }
 
}
