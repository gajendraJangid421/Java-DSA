class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int countNodes = 0;
    	Node curr = head;
    	
    	while(curr!=null){
    	    countNodes++;
    	    curr = curr.next;
    	}
    	
    	int difference = countNodes - n;
    	
    	if(difference<0){
    	    return -1;
    	}
    	
    	countNodes = 0;
    	curr = head;
    	
    	while(countNodes!=difference){
    	    countNodes++;
    	    curr = curr.next;
    	}
    	
    	return curr.data;
    }
}
