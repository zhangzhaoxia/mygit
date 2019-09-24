public class UndergraduateFactory implements IFactory{
 
	@Override
	public LeiFeng createLeiFeng() {
		
		return new Undergraduate();
	}
 
}
public class Undergraduate extends LeiFeng {
	 public void Sweep(){
		 System.out.println("大学生扫地");
	 }
	 public void Wash(){
		 System.out.println("大学生洗衣服");
	 }
	 public void BuyRice(){
		 System.out.println("大学生买米");
	 }
}
public class Test {
	public static void main(String[] args) {
		//创建一个大学生的实例
		IFactory factory = new UndergraduateFactory();	
		Undergraduate student = factory.createLeiFeng();
		student.Sweep();
		student.Wash();
		student.BuyRice();
       }
}