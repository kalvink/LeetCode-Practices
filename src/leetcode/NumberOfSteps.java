package leetcode;
class NumberOfSteps {
    public static int numberOfSteps (int num) {
        int count = 0;
        int temp;
        
        while(num!=0){
            if(num%2==0){
                count++;
                temp = num;
                num = num/2;
                
                System.out.println("Step "+count+") "+temp+" is even; divide by 2 and obtain "+num+".");
            }
            else if(num%2==1){
                count++;
                temp = num;
                num--;
                System.out.println("Step "+count+") "+temp+" is odd; subtract 1 and obtain "+num+".");

            }
            
        }
        
        return count;

       
        
        
    }
    
    
    
	public static void main(String args[]) {
            numberOfSteps(14);
  }
    
}