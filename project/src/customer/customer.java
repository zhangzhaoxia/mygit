package customer;
import FactoryBMW320.*;
import FactoryBMW523.*;
public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		BMW320 bmw320 = factoryBMW320.createBMW();
 
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW523 bmw523 = factoryBMW523.createBMW();
	}

}
