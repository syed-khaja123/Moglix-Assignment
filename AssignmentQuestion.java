import java.util.*;

class validParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		Stack<Integer> stack=new Stack<>();
		boolean valid[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
				stack.push(i);
			else if(!stack.isEmpty()&& isMatching(s.charAt(stack.peek()),ch))
			{
				     int index=stack.pop();
				     valid[index]=true;
				     valid[i]=true;
		    }
		}
		
		String res="";
		int i=0;
		while(i<n)
		{
			if(valid[i])
			{
					res+=s.charAt(i);
					i++;
			}
			else
				i++;
		}
		System.out.println(res.length());

	}
    static boolean isMatching(char open,char close)
    {
    	return (open=='('&&close==')')||
    		   (open=='{'&&close=='}')||
    		   (open=='['&&close==']');
    }
	
}