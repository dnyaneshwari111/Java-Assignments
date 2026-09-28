package Demo;

public class Aritmatic_Operation {

	public static void main(String[] args) throws Exception {
		try {
			if(args.length<3) {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			
			
			String operator=args[2];
			int result=0;
			switch(operator) {
			case"+":
				result=n1+n2;
				break;
				
			case"-":
				result=n1-n2;
				break;
				
			case"*":
				result=n1-n2;
				break;	
				
			case"/":
				result=n1-n2;
				break;	
				
				default:
					System.out.print("Invalid operator");
					return;
			}
			System.out.print("Result :"+result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Error : + Insufficient argument");
			
		} 
		catch (NumberFormatException e) {
			
			System.out.print("Error :  1 st two number should be valid");
		}
		catch (ArithmeticException e) {
			
			System.out.print("Error :  can not be divide by 0");
		}


	}

}
