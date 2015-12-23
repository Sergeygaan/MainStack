
public class WorkStack {
	
	private Stack myStack;
	private OperationsStack OperationStack;
	
	public WorkStack(Stack myStack, OperationsStack OperationStack)
	{
		this.myStack = myStack;
		this.OperationStack = OperationStack;
	}
	//�������� ������� � ����
	public void PushStack(double element)
	{
		myStack.PushStack(element);
		
	}
	//����� ������� ������� �� �����
	public double PopStack()
	{
		return myStack.PopStack();
	}
	
	//���������� ������� ������� � �����
	public double PeekStack()
	{
		return myStack.PeekStack();
	}
	
	//������� ���� ���� �� ����� � ��������� ���
	public void WithdrawStack()
	{
		System.out.print("����: ");
		while (!myStack.Empty()) {
			double value = myStack.PopStack();
		    System.out.print(value);
		    System.out.print(" ");
		}
		    System.out.println("");
	}
	
	//�������� ���� ������� ��������� � �����
	public double SumStack(double a, double b) {
		
    	return OperationStack.SumStack(a, b);
    }
	
	//��������� ���� ������� ��������� � �����
	public double MinStack(double a, double b) {
		
    	return OperationStack.MinStack(a, b);
    }
	
	//��������� ���� ������� ��������� � �����
	public double MulStack(double a, double b) {
		
    	return OperationStack.MulStack(a, b);
    }
	
	//������� ���� ������� ��������� � �����
	public double DivStack(double a, double b) {
		
    	return OperationStack.DivStack(a, b);
    }
}
    
