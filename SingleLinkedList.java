
public class SingleLinkedList 
{
	private Node head;
	
	public SingleLinkedList()
	{
		head = null;
	}
	
	public void addToEnd(Object dataToAdd)
	{
		Node newNode = new Node(dataToAdd);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			
			while(temp.getLink() != null)
			{
			   temp = temp.getLink();
			}
			
			temp.setLink(newNode);
		}
	}
	
	public String display()
	{
	    String output = "";
	    
	    Node temp = head;
		
		while(temp != null)
		{
		   output += temp.getData() + " || ";
		   temp = temp.getLink();
		}
	    
	    return output.toUpperCase();
	}
	
	public void remove(Object dataToRemove)
	{
		
		if(head == null)
		{
			System.err.println("The Linked List is empty");
		}
		else
		{
			while(head.getData().equals((String)dataToRemove))
			{
				head = head.getLink();
				
			}
			
			Node temp = head;
			Node prev = null;
			while(temp != null)
			{
				
				if(temp.getData().equals((String)dataToRemove))
				{
					prev.setLink(temp.getLink());
					temp = temp.getLink();
					
				}
				else
				{
				    prev = temp;
				    temp = temp.getLink();
				}
		
			}
		}
		
	}
	
	public int size()
	{
		if(head == null)
		{
			System.err.println("The Linked List is empty");
			return 0;
		}
		else
		{
			int counter = 0;
			
			Node temp = head;
			while(temp != null)
			{
				counter++;
				temp = temp.getLink();
			}
			
			return counter;
		}
	}
	
	public int SearchAndFindRepeat(Object dataToSearch)
	{
		
		
		int Repeat=0;
		if(head == null)
		{
			return 0;
		}
		else
		{
		    Node temp = head;
		    
		 
		    
		    while(temp != null)
		    {
		    	if(temp.getData().equals( (String) dataToSearch))
		    	{
		    		Repeat++;
		    	}
		    	
		    	temp = temp.getLink();
		    }
		    
		    return Repeat;
		}
	}

}












