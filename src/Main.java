import java.util.Random; // Import Random from Java
import java.util.Scanner; // Import Scanner from Java
public class Main {
    public static void main(String[] args) {
        // #1
        int[] dataPoints = new int[100]; // Declare an integer array of length 100 named dataPoints

        // #2
        Random rnd = new Random(); // Create a Random object
        for(int i = 0; i < dataPoints.length; i++) { // For loop to iterate through the dataPoints array
            int val = rnd.nextInt(100) + 1; // Generate a random number from 1 to 100
            dataPoints[i] = val; // Assign the dataPoints value to the random number
        }

        // #3
        for(int i = 0; i < dataPoints.length; i++) { // For loop to iterate through the dataPoints array
            if(i != dataPoints.length - 1) { // If i is not the last index
                System.out.print(dataPoints[i] + " | "); // Print the item, separating each item by |
            }
            else { // Otherwise
                System.out.print(dataPoints[i] + "\n"); // Print the item without | because it's the last item
            }
        }

        // #4
        int sum = 0; // Initialize a variable for the sum of dataPoints, initially 0
        for(int i = 0; i < dataPoints.length; i++) { // For loop to iterate through the dataPoints array
            sum += dataPoints[i]; // Add the dataPoints value to the sum
        }
        int average = sum / dataPoints.length; // Calculate the average by dividing the sum by the length of the array
        System.out.println("The sum of the random values in the array dataPoints is: " + sum); // Return results for the sum of dataPoints
        System.out.println("The average of the random values in the array dataPoints is: " + average); // Return results for the average of dataPoints

        // #5
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        int intValue = SafeInput.getRangedInt(scan, "Enter an integer value between 1 and 100", 1, 100); // Prompt user to enter an integer value between 1 and 100 using the SafeInput getRangedInt() method

        // #6
        int occurrences = 0; // Initialize a variable for the number of occurrences of the user's value in the dataPoints array
        for(int i = 0; i < dataPoints.length; i++) { // For loop to iterate through the dataPoints array
            if(dataPoints[i] == intValue) { // If the array item matches the user's value
                occurrences += 1; // Add 1 to the occurrences variable
            }
        }
        System.out.println("The value you entered " + intValue + " occurred " + occurrences + " times within the dataPoints array."); // Return results for the number of occurrences

        // #7
        int intValue2 = SafeInput.getRangedInt(scan, "Enter another integer value between 1 and 100: ", 1, 100); // Prompt user to enter another integer value between 1 and 100 using the SafeInput getRangedInt() method
        int firstPosition = -1; // Initialize a variable for the first position of the occurrence of the user's value, initially -1
        for(int i = 0; i < dataPoints.length; i++) { // For loop to iterate through the dataPoints array
            if(dataPoints[i] == intValue2) { // If the array item matches the user's value
                firstPosition = i; // Record the index of this first occurrence
                break; // Break to exit the loop
            }
        }
        if(firstPosition == -1) { // If the first position is -1, which is what it was initially set to (meaning no occurrences)
            System.out.println("The value you entered "+intValue2+" is not in the array."); // Tell the user that their value isn't in the array
        }
        else { // Otherwise
            System.out.println("The value you entered "+intValue2+" first occurred at array index "+firstPosition+"."); // Tell the user the index of the first occurrence
        }

        // #8
        int minimum = dataPoints[0]; // Initialize a variable for the minimum of dataPoints, starting with the first item
        int maximum = dataPoints[0]; // Initialize a variable for the maximum of dataPoints, starting with the first item
        for(int i = 1; i < dataPoints.length; i++) { // For loop to iterate through the other items of the dataPoints array
            if(dataPoints[i] < minimum) { // If the array item is smaller than the current minimum
                minimum = dataPoints[i]; // Reassign minimum to the array item, the new minimum
            }
            else if(dataPoints[i] > maximum) { // If the array item is larger than the current maximum
                maximum = dataPoints[i]; // Reassign maximum to the array item, the new maximum
            }
        }
        System.out.println("The minimum and maximum values of the dataPoints array is "+minimum+" and "+maximum+", respectively."); // Return results for the minimum and maximum of dataPoints

        // #9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints)); // Compute and output the average of dataPoints using the static method getAverage() created outside of the main method

        // #10 (Extra Credit)
        System.out.println("The minimum value of the dataPoints array is " + min(dataPoints)); // Compute and output the minimum value of the dataPoints array using the static method min() created outside of the main method
        System.out.println("The maximum value of the dataPoints array is " + max(dataPoints)); // Compute and output the maximum value of the dataPoints array using the static method max() created outside of the main method
        System.out.println("The number of occurrences of " + intValue + " is " + occurrenceScan(dataPoints, intValue)); // Compute and output the number of occurrences of intValue in the dataPoints array using the static method occurrenceScan() created outside of the main method
        System.out.println("The sum of the dataPoints array is " + sum(dataPoints)); // Compute and output the sum of the dataPoints array using the static method sum() created outside of the main method
        System.out.println("The boolean for whether the dataPoints array contains " + intValue2 + " is " + contains(dataPoints, intValue2)); // Compute and output whether the dataPoints array contains intValue2 using the static method contains() created outside of the main method
    }
    public static double getAverage(int[] values) { // Method for computing the average of an integer array
        int sum = 0; // Initialize a variable for the sum of dataPoints, initially 0
        for(int i = 0; i < values.length; i++) { // For loop to iterate through the dataPoints array
            sum += values[i]; // Add the dataPoints value to the sum
        }
        int average = sum / values.length; // Calculate the average by dividing the sum of dataPoints by the length of dataPoints
        return average; // Return the computed average of the values array
    }
    public static int min(int values[]) { // Method for computing the minimum of an integer array
        int minimum = values[0]; // Initialize a variable for the minimum of values, starting with the first item
        for(int i = 1; i < values.length; i++) { // For loop to iterate through the other items of the values array
            if(values[i] < minimum) { // If the array item is smaller than the current minimum
                minimum = values[i]; // Reassign minimum to the array item, the new minimum
            }
        }
        return minimum; // Return the minimum of the values array
    }
    public static int max(int values[]) { // Method for computing the maximum of an integer array
        int maximum = values[0]; // Initialize a variable for the maximum of values, starting with the first item
        for(int i = 1; i < values.length; i++) { // For loop to iterate through the other items of the values array
            if(values[i] > maximum) { // If the array item is larger than the current maximum
                maximum = values[i]; // Reassign maximum to the array item, the new maximum
            }
        }
        return maximum; // Return the maximum of the values array
    }
    public static int occurrenceScan(int values[], int target) { // Method for computing the number of occurrences an integer has in an integer array
        int occurrences = 0; // Initialize a variable for the number of occurrences of the target in the values array
        for(int i = 0; i < values.length; i++) { // For loop to iterate through the values array
            if(values[i] == target) { // If the array item matches the target
                occurrences += 1; // Add 1 to the occurrences variable
            }
        }
        return occurrences; // Return the number of occurrences of target in the values array
    }
    public static int sum(int values[]) { // Method for computing the sum of an integer array
        int sum = 0; // Initialize a variable for the sum of values, initially 0
        for(int i = 0; i < values.length; i++) { // For loop to iterate through the values array
            sum += values[i]; // Add the array value to the sum
        }
        return sum; // Return the sum of the values array
    }
    public static boolean contains(int values[], int target) { // Method for computing whether an integer array contains an integer
        boolean containsBool = false; // Initialize a boolean variable for whether the values array contains target
        for(int i = 0; i < values.length; i++) { // For loop to iterate through the values array
            if(values[i] == target) { // If the array item matches the target
                containsBool = true; // Set the containsBool variable to true
                break; // Break to exit the loop because no need to continue
            }
        }
        return containsBool; // Return whether the values array contains target
    }
}