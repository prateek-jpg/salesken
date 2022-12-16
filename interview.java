import java.util.*;
public class interview {

	
		
		
	 
	    
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        List<String> student=new ArrayList<>();
	        
	        int n=sc.nextInt();//taking number of students in class
	        int e1[]=new int[n];
	        int m1[]=new int[n];
	        int s1[]=new int[n];
	        int e2[]=new int[n];
	        int m2[]=new int[n];
	        int s2[]=new int[n];
	        System.out.println("Enter name,marks of 3 subject for semester 1:");
	        for(int i=0;i<n;i++) {
	        	System.out.println("Enter name:");
	        	student.add(sc.next());
	        	System.out.println("English:");
	        	e1[i]=sc.nextInt();
	        	System.out.println("Maths:");
	        	m1[i]=sc.nextInt();
	        	System.out.println("Science:");
	        	s1[i]=sc.nextInt();
	        	
	        }
	        System.out.println("Enter marks of 3 subject for semester 2:");
	        for(int i=0;i<n;i++) {
	        	System.out.println("Enter marks of "+student.get(i)+" :");
	        	System.out.println("English:");
	        	e2[i]=sc.nextInt();
	        	System.out.println("Maths:");
	        	m2[i]=sc.nextInt();
	        	System.out.println("Science:");
	        	s2[i]=sc.nextInt();
	        	
	        }
//	        Calculating percenatge of all subject
	        double percentage[]=new double[n];
	        for(int i=0;i<n;i++) {
	        	int sum=e2[i]+m2[i]+s2[i];
	        	percentage[i]=sum/3;
	        }
	        double p1=0;
	        for(int i=0;i<n;i++) {
	        	p1=p1+percentage[i];
	        }
	       p1=(p1/(n*100))*100;
	        
	        
	       int avg1=0,avg2=0,avg3=0;
	       for(int i=0;i<n;i++) {
	    	   avg1=avg1+e1[i]+e2[i];
	    	   avg2+=m1[i]+m2[i];
	    	   avg3=s1[i]+s2[i];
	       }
	       avg1=(avg1/(n*n));
	       avg2=(avg2/(n*n));
	       avg3=(avg3/(n*n));
	       
//	       
	       
	       double average[]=new double[n];
	       for(int i=0;i<n;i++) {
	    	   average[i]=e1[i]+m1[i]+s1[i]+e2[i]+m2[i]+s2[i];
	    	   average[i]=average[i]/2;
	       }
	       double first=0,second=0;
	       int pos1=0,pos2=0;
	       for (int i = 0; i < n; i++) {
	            
	            if (average[i] > first) {
	                second = first;
	                first = average[i];
	                pos1=i;
	            }
	 
	          
	            else if (average[i] > second && average[i] != first) {
	            	second = average[i];pos2=i;
	            }
	                
	        }
	       System.out.println("Average Percentage of whole class in recent semester:"+p1);
	       System.out.println("AVerage in English:"+avg1+" AVerage in maths:"+avg2+" AVerage in science:"+avg3);
	       System.out.println("Top 2 Consistent Students across all semesters:"+student.get(pos1)+" and "+student.get(pos2));
	       
	       

	
	    }

}
