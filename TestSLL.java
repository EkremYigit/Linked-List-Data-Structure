
import java.util.Scanner;

public class TestSLL {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		SingleLinkedList String1  = new SingleLinkedList();
		SingleLinkedList String2  = new SingleLinkedList();
		SingleLinkedList Matched1 = new SingleLinkedList();
		SingleLinkedList Matched2 = new SingleLinkedList();
		boolean Identical=true;
		System.out.println("First Data");
		String str1=input.nextLine();//İlk veri
		System.out.println("Second Data");
		String str2=input.nextLine();//ikinci veri
		if(str1.length()!=str2.length()){
			
			Identical=false;
			System.out.println("Your Data is wrong to compare(these are not equal)");
		}
		
		
		else {
			String Data1=str1.toLowerCase();
			String Data2=str2.toLowerCase();
			
			
			for (int i = 0; i < Data1.length() && Identical; i++) {
				String1.addToEnd(Data1.substring(i, i+1));
				String2.addToEnd(Data2.substring(i, i+1));
				
					if(String1.SearchAndFindRepeat(Data1.substring(i, i+1))==String2.SearchAndFindRepeat(Data2.substring(i, i+1))){
						
						
						if(Matched1.SearchAndFindRepeat(Data1.substring(i, i+1))==0){
						
							Matched1.addToEnd(Data1.substring(i, i+1));
							Matched2.addToEnd(Data2.substring(i, i+1));
							
						}
					}
					else
						Identical=false;
					
				
			}
			
			if(Identical){//Identical 
				System.out.println("These Inputs Are Identical!!");
				System.out.println("Matched Letters: ");
				System.out.print("1-)");
				System.out.print(Matched1.display());
				System.out.println("");
				System.out.print(" ");
				for(int i=0;i<Matched1.size();i++){ //Second Matched
					System.out.print("  ↓  ");	
				}
				System.out.println("");
				System.out.print("2-)");
				System.out.print(Matched2.display());
				System.out.println("");
				System.out.println("Blank Charecters are avaiable to display if output contains blank charecter its comes from first input.");
				
			}
			else{
				System.out.println("These Inputs Are NOT Identical!");
			}
		
		
		}
		

		
	
	}
}
