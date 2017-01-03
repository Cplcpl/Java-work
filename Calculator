package calculator;

import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) 
    {
		
		start();
		
    }
	
    private static void menu()
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("===== Welcome to the Calculator2000 ====");
        System.out.println("===== 1:        Square Root         ====");
        System.out.println("===== 2:          Exponent          ====");
        System.out.println("===== 3:          Minimum           ====");
        System.out.println("===== 4:          Maximum           ====");
        System.out.println("===== 5:            Cos             ====");
        System.out.println("===== 6:            Tan             ====");
        System.out.println("===== 7:          Radians           ====");
        System.out.println("===== 8:          Degrees           ====");
        System.out.println("                                        ");
        System.out.println("    Which math program will you use ?   ");
        
        int program = reader.nextInt();
        
        if ( program == 1 )
        {
            sqRoot();
            
        }
        
        else if ( program == 2 )
        {
            exponent();
            
        }
        
        else if ( program == 3 )
        {
            minimum();
        }
        
        else if ( program == 4 )
        {
        	maximum();
        }
        
        else if ( program == 5 )
        {
        	cos();
        }
        
        else if ( program == 6 )
        {
        	tan();
        }
        
        else if ( program == 7 )
        {
        	radians();
        }
        
        else if ( program == 8)
        {
        	degrees();
        }
        
        else if ( program == 9)
        {
        	asin();
        }
        
        else if ( program == 10)
        {
        	ayy_lamo();
        }
        
        reader.close();
        
    }
        
    private static void sqRoot()
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the number you would like the root of: ");   
        int rootUser = reader.nextInt();
        
        double rootResult = Math.sqrt(rootUser);
        
        System.out.println("The square root of " + (double)rootUser + " is " + rootResult); 
        
        reader.close();
        
    }
    
    private static void exponent()
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please enter the base: ");
        int baseUser = reader.nextInt();
        
        System.out.println("Please enter the exponent: ");
        int expUser = reader.nextInt();
        
        double exponentResult = Math.pow(baseUser, expUser);
        
        System.out.println((double)baseUser + " to the power of " + (double)expUser + " is " + exponentResult);
        
        reader.close();
        
    }
    
    private static void minimum()
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please enter number 1: ");
    	double minNum1 = reader.nextDouble();
    	
    	System.out.println("Please enter number 2: ");
    	double minNum2 = reader.nextDouble();
    	
    	double min = Math.min(minNum1, minNum2);
    	
    	System.out.println("The minimum value of " + minNum1 + " and " + minNum2 + " is " + min); 
        
    	reader.close();
    	
    }
    
    private static void maximum()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter number 1: ");
    	double maxNum1 = reader.nextDouble();
    	
    	System.out.println("Please enter number 2: ");
    	double maxNum2 = reader.nextDouble();
    	
    	double max = Math.max(maxNum1, maxNum2);
    	
    	System.out.println("The maximum value of " + maxNum1 + " and " + maxNum2 + " is " + max);
    	
    	reader.close();
    	
    }
    
    private static void cos()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter the angle: ");
    	double angle = reader.nextDouble();
    	
    	
    	double cos = Math.cos(angle);
    	
    	System.out.println(cos);
    	
    	reader.close();
    	
    }
    
    private static void tan()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter the angle: ");
    	double angle = reader.nextDouble();
    	
    	
    	double tan = Math.tan(angle);
    	
    	System.out.println(tan);
    	
    	reader.close();
    
    }
    
    private static void radians()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter the degrees: ");
    	double angle = reader.nextDouble();
    	
    	
    	double rad = Math.toRadians(angle);
    	
    	System.out.println(rad);
    	
    	reader.close();
    }
    
    private static void degrees()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter the radians: ");
    	double angle = reader.nextDouble();
    	
    	
    	double rad = Math.toRadians(angle);
    	
    	System.out.println(rad);
    	
    	reader.close();
    	
    }
    
    private static void asin()

    {
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Please enter the angle: ");
    	double angle = reader.nextDouble();
    	
    	
    	double asin = Math.asin(angle);
    	
    	System.out.println(asin);
    	
    	reader.close();
    	
    } 
    
    private static void start()
    {
    	Scanner reader = new Scanner(System.in);
    	
    	while(true)
    	{
    		String yes = "yes";
    		
    		
    		
    		System.out.println("Would you like to run the program? : ");
    		String userIn = reader.next();
    		
    		if (userIn.equalsIgnoreCase(yes))
    		{
    			menu();
    		}
    		else
    		{
    			System.out.println("okay :( ");
    			
    			System.out.println("Program closed");
    			
    			System.exit(1);
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    }
    
    private static void ayy_lamo()
    {
    System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOOO88888888888888888OMMMMMMMMMMMMMMMMMMMMM");
    System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888OMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888888888888OMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888888888888888OMMMMMMMMMMMMM");				
    System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888888MMMMMMMMMMMM");
    System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888OMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMM88888888888888888888888888888888888888888888OMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888888888OMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888888888OMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888888888OMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888888888OMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM$8888888888888888888888888888888888888888888888OMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888888888888888888888MMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888888888888888888MMMMMM");
	System.out.println("MMMMMMMMMMMMOMMMMMMMMMMO88888888888888888888888888888888888888888888888888MMMMMM");
	System.out.println("M$MMMMMMMM$888MMMMMMMMMM88888888888888888888888888888888888888888888888888OMMMMM");
	System.out.println("888OMMMMMM8888OMMMMMMMMO888888888888888888888888888888888888888888888888888MMMMM");
	System.out.println("88888DMMMM8888OMMMMMMMM88DMMMMMMMMO88888888888888888888888888888NMMMMMMMM88$MMMM");
	System.out.println("O88888MMMM8888MMMMMMMMMO8OMMMMMMMMMMM888888888888888888888888MMMMMMMMMMMM88$MMMM");
	System.out.println("MO88888MMO8888OMMMMMMMMO88MMMMMMMMMMMMM88888888888888888888MMMMMMMMMMMMMO88$MMMM");
	System.out.println("MM88888OMO888OMMMMMMMMM888MMMMMMMMMMMMMMO88888888888888888MMMMMMMMMMMMMM8888MMMM");
	System.out.println("MMMO8888MO888OMMMMMMMMMO888MMMMMMMMMMMMMMM88888888888888NMMMMMMMMMMMMMMO888MMMMM");
	System.out.println("MMMMO888OO888MMMMMMMMMMM888OMMMMMMMMMMMMMMM888888888888OMMMMMMMMMMMMMMM8888MMMMM");
	System.out.println("MMMMMO8888888OMMMMMMMMMO8888OMMMMMMMMMMMMMMO88888888888MMMMMMMMMMMMMMM8888MMMMMM");
	System.out.println("MMMMMMO888888MMMMMMMMMMMO88888MMMMMMMMMMMMMM8888888888DMMMMMMMMMMMMMM88888MMMMMM");
	System.out.println("MMMM8888888888OMMMMMMMMMO88888OMMMMMMMMMMMMM8888888888MMMMMMMMMMMMMD88888MMMMMMM");
	System.out.println("MMO8888888888888OMMMMMMMMM888888NMMMMMMMMMMMM88888888OMMMMMMMMMMMM888888OMMMMMMM");
	System.out.println("O888888888888888$MMMMMMMMMO8888888MMMMMMMMMMM88888888DMMMMMMMMMMO8888888MMMMMMMM");
	System.out.println("O88888888888888OMMMMMMMMMMM888888888OMMMMMMMM88888888MMMMMMMMO8888888888MMMMMMMM");
	System.out.println("M88888888888888MMMMMMMMMMMM$888888888888NMMMM88888888MMMMMO888888888888MMMMMMMMM");
	System.out.println("MO8888888888888OMMMMMMMMMMMM$8888888888888888888888888888888888888888MMMMMMMMMMM");
	System.out.println("M8888888888888O8MMMMMMMMMMMMM888888888888888888888888888888888888888OMMMMMMMMMMM");
	System.out.println("MMMM88888888888MMMMMMMMMMMMMMM$888888888888888888888888888888888888MMMMMMMMMMMMM");
	System.out.println("MMMMMMO88888888OMMMMMMMMMMMMMMMMO888888888888888888888888888888888OMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMO8888888MMMMMMMMMMMMMMMMMO8888888888888888888888888888888IMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMO888888MMMMMMMMMMMMMMMMMO88888888888888888888888888888MMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMM888888MMMMMMMMMMMMMMMMMMO88888888888888888888888888MMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMM888888MMMMMMMMMMMMMMMMMMMO88888888888888888888888$MMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMO88888OMMMMMMMMMMMMMMMMMMMM88888888888888888888OMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMO888888MMMMMMMMMMMMMMMMMMMMO8888888888888888OMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMI888888OMMMMMMMMMMMMMMMMMMMMMO888888888888OMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMM8888888OMMMMMMMMMMMMMMMMMMMMMMO8888888OMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMO8888888OMMMMMMMMMMMMMMMMMMMMMMO8888888MMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMO88888888OMMMMMMMMMMMMMMMMMMM888888888OMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMM888888888OOM$MMMMMMMMMMMO8888888888888OMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888888OOMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMOO88888888888888888888888888888888888888888OOMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMM8O88888888888888888888888888888888888888888MMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMOO8888888888888888888888888888888888888OMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8O888888888888888888888888888888888OMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888888OMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888888888888888MMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888MMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888OMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888888888888888OMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888888888MMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888888888888888888MMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$888888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888MMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888MMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888OMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM88888888888888888888888888888888888OMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888OMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888MMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888888OMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888888888888OMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888888OMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888888888OMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888888888MMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888888MMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO8888888888888888888888MMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888888MMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888888OMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888OMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888MMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO88888888888888888888MMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM88888888888888888888$MMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888OMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$88888888888888888888MMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8888888888888888888OMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM88888888888888888888MMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888MMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888MMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888OMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888MMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO888888888888888888MMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM888888888888888888MMMMMMMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM88888888888888888OZOOO$MMMMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$88888888888888888OMMMMMM$MMMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOMOOOO8888888888888888888888OO8OO8M$MMMMMMMMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMOO88888888888888888888888888888888888888888OD$MMMMMMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMO888888888888888888888888888888888888888888888888888O$MMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMMO8888888888888888888888888888888888888888888888888888888OMM");
	System.out.println("MMMMMMMMMMMMMMMMMMMMO888888888888888888888888888OMO8888888888888888888888888888Z");
	System.out.println("MMMMMMMZ8$8MMMMMMMMM8888888888888888888888888O$MMMM$MO88888888888888888888888888");
	System.out.println("MMMZO$MMMMMM$OZMMMMM888888888888888888888OMMMMMMMMOMOO888O8888888888888888888888");
	System.out.println("MM$MMM$OOOO8MMM$8MMMO88888888888888888OMMMMMMMMMM$MOOO888888O8888888888888888888");
	System.out.println("MMMOOOO8888OOOOMM$MMM8888888888888OMMMMMMMMMMMMMMOMOO88888888888O88888888888888M");
	System.out.println("8MOOOOOOO8OOOOOOOMZZMMMZMMMMMZDMMMMMMMMMMMMMMMMMOMOO88888888888888888OO888888MMM");
	System.out.println("                                   ayy lmao                                     ");
    }

    
    
}
