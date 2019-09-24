public class UndergraduateFactory implements IFactory{
 
	@Override
	public LeiFeng createLeiFeng() {
		
		return new Undergraduate();
	}
 
}
public class Undergraduate extends LeiFeng {
	 public void Sweep(){
		 System.out.println("��ѧ��ɨ��");
	 }
	 public void Wash(){
		 System.out.println("��ѧ��ϴ�·�");
	 }
	 public void BuyRice(){
		 System.out.println("��ѧ������");
	 }
}
public class Test {
	public static void main(String[] args) {
		//����һ����ѧ����ʵ��
		IFactory factory = new UndergraduateFactory();	
		Undergraduate student = factory.createLeiFeng();
		student.Sweep();
		student.Wash();
		student.BuyRice();
       }
}