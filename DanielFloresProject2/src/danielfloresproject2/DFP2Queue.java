/*
******************************************************
*** Project 2
*** Daniel Flores
******************************************************
*** Created as part of project 2
******************************************************
*** September 16, 2017
******************************************************
*** Original, no changes
******************************************************
 */
package danielfloresproject2;



public class DFP2Queue
{
    public DFP2LinkList start;
    public DFP2LinkList end;
    
    public DFP2Queue()
    {
        start = null;
        end = null;
    }
    
    public void addToQueue(int value) // Adds each number to the list
    {
        if (start == null)
        {
            DFP2LinkList temp = new DFP2LinkList();
            temp.value = value;
            start = temp;
            end = temp;
        }
        else
        {
            DFP2LinkList temp = new DFP2LinkList();
            temp.value = value;
            end.nextLL = temp;
            end = temp;
        }
    }
    
    public void clearList() // Clears each number from the list
    {
        if(start != null)
        {
            start = start.nextLL;
        }
    }
    
    public String search(int toFind) // Begins search
    {
        return reSearch(toFind);
    }
    
    public String reSearch (int toFind)
    {   
        int count = 1; // Tracks position on list
        String Result = "Number Not Found"; // Default statement
        DFP2LinkList temp = new DFP2LinkList();
        temp = start; // Copy list

        if (temp.value == toFind) // Check if first number matches
        {
            Result = "Number found on the " + Integer.toString(count) + " spot on the list";
            return Result;
        }
        
        while (temp.nextLL != null) // Go through list after first number
        {
            temp = temp.nextLL; // Move to next position
            count++; // Increment counter to keep track of list position
            
            if (temp.value == toFind)
            {
                Result = "Number found on the " + Integer.toString(count) + " spot on the list";
                return Result;
            }
        }
        
        return Result; // Return default statement if nothing is found
    }
}