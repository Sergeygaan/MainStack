
public class Main {
	
    public static void main(String[] args) {
    	
    	Stack myStack = new Stack();
    	OperationsStack OperationStack = new OperationsStack();

    	WorkStack  CurrentStack = new WorkStack(myStack, OperationStack);

    	
    	CurrentStack.PeekStack();

    	CurrentStack.PushStack(0);
    	
    	CurrentStack.PushStack(10);
    	
    	CurrentStack.PushStack(54.9);
    	
    	CurrentStack.WithdrawStack();
    	
    }
}
