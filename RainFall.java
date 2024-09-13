// writting a object
/**
   Write a RainFall class that stores the total rainfall for each of 12 months into an array of 
      doubles. The program should have methods that return the following:
      
   •	 the total rainfall for the year
   •	 the average monthly rainfall
   •	 the month with the most rain
   • 	 the month with the least rain
   
   Demonstrate the class in a complete program.< 
   >Input Validation: Do not accept negative numbers for monthly rainfall figures.<
*/

public class RainFall
{
   private double [] rainfallAmount;
  
  //constructor
   public RainFall()
   {
      rainfallAmount = new double[12];
   }
  
  //constructor #2: accepts array as argument
   public RainFall(double[] array)
   {
     // created a new array to holds the same value as passed  
      rainfallAmount = new double[array.length];
     //for loop that will copy element of the array into the rainfall amount array
     
      for(int i=0; i < rainfallAmount.length; i++)
      {
         rainfallAmount[i] = array[i];
      }
   }
  
                                       // methods
  
  /**
     get the total rain falls 
  */
   public double getTotalRainfall()
   {
      double total = 0;
      for (double rain: rainfallAmount)
      {
         total += rain;
      }
      return total;
   }
  
  
  /**
  get the average monthly rain falls
  */
   public double getAverageRainfall()
   {
      return getTotalRainfall() / rainfallAmount.length;
   }

  
  /**
  get the month with the most rains
  */
   public double getMostRainfallMonth()
   {
      double highest = rainfallAmount[0];
      int monthIndex = 0;
     
      for( int i = 0; i <  rainfallAmount.length; i++)
      {
         if(rainfallAmount[i] > highest)// find new highest rainfall amount
         {
            highest = rainfallAmount[i];
            monthIndex = i;
         }
      }
      return monthIndex; // returns the index of the array that has the highest value
   }
  
  /**
  get the onth with the least rain
  */
   public double getLeastRainfallMonth()
   {
      double lowest = rainfallAmount[0];
      int monthIndex = 0;
     
      for( int i = 0; i <  rainfallAmount.length; i++)
      {
         if(rainfallAmount[i] < lowest)// find new lowest rainfall amount
         {
            lowest = rainfallAmount[i];
            monthIndex = i;
         }
      }
      return monthIndex; // returns the index of the array that has the lowest value
   }

  
}
