public class RainfallDemo
{
   public static void main(String[] args)
   {
      double[] rain = {1.1, 2.1, 0.3, 3.2, 5.4, 2.1, 2.2, 1.6, 3.9, 3.4, 8.1, 1.7};
      
      RainFall rf = new RainFall(rain);
      
      System.out.println("the total rainfall for the year: " + rf.getTotalRainfall() );
      System.out.println("the average monthly rainfall: " + rf.getAverageRainfall() );
      System.out.println("the month with the most rain: " + rf.getMostRainfallMonth() );
      System.out.println("the month with the least rain: " + rf.getLeastRainfallMonth() );
      
   }
}