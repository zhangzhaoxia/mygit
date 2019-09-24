 public class OperationFactory {
 
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			// ����ת��
			oper = new NumberAdd();
			break;
		case "-":
			oper = new NumberSub();
			break;
		case "*":
			oper = new NumberMul();
			break;
		case "/":
			oper = new NumberDiv();
			break;
		default:
			break;
		}
		return oper;
	} 
}

