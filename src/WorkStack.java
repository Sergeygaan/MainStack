
public class WorkStack {
	
	private Stack myStack;
	private OperationsStack OperationStack;
	
	public WorkStack(Stack myStack, OperationsStack OperationStack)
	{
		this.myStack = myStack;
		this.OperationStack = OperationStack;
	}
	//Добавить элемент в стек
	public void PushStack(double element)
	{
		myStack.PushStack(element);
		
	}
	//Взять верхний элемент из стека
	public double PopStack()
	{
		return myStack.PopStack();
	}
	
	//Посмотреть верхний элемент в стеке
	public double PeekStack()
	{
		return myStack.PeekStack();
	}
	
	//Вывести весь стек на экран и отчистить его
	public void WithdrawStack()
	{
		System.out.print("Стек: ");
		while (!myStack.Empty()) {
			double value = myStack.PopStack();
		    System.out.print(value);
		    System.out.print(" ");
		}
		    System.out.println("");
	}
	
	//Сложение двух верхних элементов в стеке
	public double SumStack(double a, double b) {
		
    	return OperationStack.SumStack(a, b);
    }
	
	//Вычитание двух верхних элементов в стеке
	public double MinStack(double a, double b) {
		
    	return OperationStack.MinStack(a, b);
    }
	
	//Умножение двух верхних элементов в стеке
	public double MulStack(double a, double b) {
		
    	return OperationStack.MulStack(a, b);
    }
	
	//Деление двух верхних элементов в стеке
	public double DivStack(double a, double b) {
		
    	return OperationStack.DivStack(a, b);
    }
}
    
