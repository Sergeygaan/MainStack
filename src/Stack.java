import java.util.ArrayList;

public class Stack {

	ArrayList <Double> ArrayList = new ArrayList<Double>();
 
	public Stack() {
		ArrayList = new ArrayList<Double>();
	}

	public void PushStack(double element){
		ArrayList.add(element);	
	}
 
  
	public double PopStack() {
		if (!Empty())
    	{
    		double result = ArrayList.get(ArrayList.size() - 1);
    		ArrayList.remove(ArrayList.size() - 1);
    		return result;
    		
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Empty stack");
		}
    }
    
    public double PeekStack() {
			if (!Empty())
	    	{
	    		return ArrayList.get(ArrayList.size() - 1);
			}
			else
			{
				throw new ArrayIndexOutOfBoundsException("Empty stack");
			}
    }
    
    public boolean Empty() {
        return ArrayList.isEmpty();
    }

    public void Clean() {
        ArrayList.clear();
    }
    
}
 
	
	

