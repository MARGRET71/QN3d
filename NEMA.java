/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bit.nema;

/**
 *
 * @author user
 */
public class NEMA {
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;     
    import java.util.Random;


public class AQIAnalysis {

    public static void main(String[] args) {
        System.out.println("--- Air Quality Index (AQI) Analysis for Kampala City ---");
        List<Integer> aqiReadings = new ArrayList<>();
        Random random = new Random();
        int numberOfReadings = 30; 

        System.out.println("\nGenerating " + numberOfReadings + " random AQI readings (range: 1-300):");
        for (int i = 0; i < numberOfReadings; i++) {
            
            int aqi = random.nextInt(300) + 1;
            aqiReadings.add(aqi);
            System.out.printf("  Day %2d: AQI = %d%n", (i + 1), aqi);
        }

        
        
        System.out.println("\nSorted AQI Readings: " + aqiReadings);

        double medianAQI;
        int size = aqiReadings.size(); 

        
        if (size % 2 == 0) {
            
            int middle1 = size / 2 - 1;
            int middle2 = size / 2;
            medianAQI = (aqiReadings.get(middle1) + aqiReadings.get(middle2)) / 2.0;
        } else {
            
            medianAQI = aqiReadings.get(size / 2);
        }
        System.out.printf("\nComputed Median AQI Value: %.2f%n", medianAQI);


       
        int hazardousDaysCount = 0;
        System.out.println("\n--- Identifying Hazardous Days (AQI > 200) ---");
      
        for (int i = 0; i < size; i++) {
            int aqi = aqiReadings.get(i);
            if (aqi > 200) {
                hazardousDaysCount++;
                
                System.out.printf("  Day %2d: AQI = %d (Hazardous)%n", (i + 1), aqi);
            }
        }
        System.out.println("\nTotal Number of Hazardous Days (AQI > 200): " + hazardousDaysCount);

        System.out.println("\n--- AQI Analysis Complete ---");
    }
}

    

   
}
