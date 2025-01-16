import java.util.Scanner;

public class CalculateDistance {
    
    // Function to calculate the minimum ASCII difference
    public static int calculateDistance(String goodString, String name) {
        int totalDistance = 0;
        char prevGoodChar = goodString.charAt(0); // Initially, the first letter of goodString is the previous good character

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            
            // If the current character is already in goodString, no distance is added
            if (goodString.indexOf(currentChar) != -1) {
                prevGoodChar = currentChar; // The current char becomes the previous good char
                continue;
            }

            // Otherwise, find the nearest character in goodString
            int minDistance = Integer.MAX_VALUE;
            char nearestGoodChar = goodString.charAt(0); // Initialize with the first good char
            
            for (int j = 0; j < goodString.length(); j++) {
                char goodChar = goodString.charAt(j);
                int distance = Math.abs(currentChar - goodChar);

                if (distance < minDistance) {
                    minDistance = distance;
                    nearestGoodChar = goodChar;
                } else if (distance == minDistance) {
                    // If equidistant, select the one closer to the previous good character
                    if (Math.abs(prevGoodChar - goodChar) < Math.abs(prevGoodChar - nearestGoodChar)) {
                        nearestGoodChar = goodChar;
                    }
                }
            }
            
            // Update the total distance
            totalDistance += Math.abs(currentChar - nearestGoodChar);
            prevGoodChar = nearestGoodChar; // Update the previous good character
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the good string
        String goodString = sc.nextLine();
        
        // Read the name string
        String name = sc.nextLine();
        
        // Calculate and print the total distance
        int result = calculateDistance(goodString, name);
        System.out.println(result);
        
        sc.close();
    }
}
