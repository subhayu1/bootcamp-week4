public class Main {

  public static void main(String[] args) {
    // 1. Create an array of int called ages
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    // a. Subtract the first element from the last element
    //    (use array[array.length - 1] to access the last element of an array)
    int result = ages[0] - ages[ages.length - 1];
    System.out.println("Result of subtraction: " + result);

    // b. Create a new array with dynamic length
    int[] newAges = new int[ages.length + 1];
    result = ages[0] - newAges[newAges.length - 1];
    System.out.println("Result from new array: " + result);

    // c. Calculate the average age
    int sum = 0;
    // Enhanced for loop to iterate through an array
    for (int age : ages) {
      sum += age;
    }
    // Casting to double to get a decimal value.
    //dividing by the length of the array to get the average
    //average formula: sum of all elements / number of elements
    double average = (double) sum / ages.length;
    System.out.println("Average age: " + average);

    // 2. Create an array of String called names
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    // a. Calculate average number of letters per name
    int totalLetters = 0;
    //using enhanced for loop to iterate through an array and reassigned the totalLetters variable
    for (String name : names) {
      totalLetters += name.length();
    }
    // similar to above, casting to double to get a decimal value and dividing by the length of the array
    double avgLetters = (double) totalLetters / names.length;
    System.out.println("Average number of letters per name: " + avgLetters);

    // b. Concatenate all names
    StringBuilder concatenatedNames = new StringBuilder();
    for (String name : names) {
      //use StringBuilder.append() method to concatenate strings
      concatenatedNames.append(name).append(" ");
    }
    System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

    // 3. Access the last element of any array using array[array.length - 1]

    // 4. Access the first element of any array using array[0]

    // 5. Create a new array of int called nameLengths
    int[] nameLengths = new int[names.length];
    //using a regular for loop to iterate through an array and assign the length of each name to the nameLengths array
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }

    // 6. Calculate the sum of elements in nameLengths
    int sumOfNameLengths = 0;
    for (int length : nameLengths) {
      sumOfNameLengths += length;
    }
    System.out.println("Sum of name lengths: " + sumOfNameLengths);

    // 7. Method to concatenate a word n times
    String concatenatedWord = concatenateWord("Hello", 3);
    System.out.println("Concatenated Word: " + concatenatedWord);

    // 8. Method to create a full name
    //takes in two strings and returns a string (full name
    String fullName = createFullName("Subhayu", "Rimal");
    System.out.println("Full Name: " + fullName);

    // 9. Method to check if the sum of ints in an array is greater than 100
    int[] numbers = {1, 2, 35};
    boolean isSumGreaterThan100 = isSumGreaterThan100(numbers);
    System.out.println("Is sum greater than 100? " + isSumGreaterThan100);

    // 10. Method to calculate the average of elements in an array
    double[] values = {3.0, 5.0, 7.0};
    double averageValue = calculateAverage(values);
    System.out.println("Average Value: " + averageValue);

    // 11. Method to compare averages of two arrays
    double[] array1 = {10.0, 20.0, 30.0};
    double[] array2 = {5.0, 15.0, 25.0};
    boolean isAvg1GreaterThanAvg2 = isAverageGreaterThan(array1, array2);
    System.out.println("Is average of array1 greater than array2? " + isAvg1GreaterThanAvg2);

    // 12. Method to check if it's hot outside and if there's enough money for a drink
    boolean willBuyDrink = willBuyDrink(true, 12.0);
    System.out.println("Will buy a drink? " + willBuyDrink);

    // 13. Your custom method
    // method to check if an animal is a cat or a dog based on the sound it makes
    String animal = "meow";
    String catOrDog = isCatOrDog(animal);
    System.out.println("It's a/an " + catOrDog);

  }

  // Method to concatenate a word n times
  public static String concatenateWord(String word, int n) {
    return String.valueOf(word).repeat(n);
  }

  // Method to create a full name
  public static String createFullName(String firstName, String lastName) {
    String space = " ";
    return firstName + space + lastName;
  }

  // Method to check if the sum of ints in an array is greater than 100
  //takes in an array of ints and returns a boolean
  public static boolean isSumGreaterThan100(int[] arr) {
    int sum = 0;
    int max = 100;
    for (int num : arr) {
      sum += num;
    }
    //same as if (sum > 100) { return true; } else { return false; }
    return sum > max;
  }

  // Method to calculate the average of elements in an array
  public static double calculateAverage(double[] arr) {
    double sum = 0;
    for (double num : arr) {
      sum += num;
    }
    return sum / arr.length;
  }

  // Method to compare averages of two arrays
  public static boolean isAverageGreaterThan(double[] arr1, double[] arr2) {
    double avg1 = calculateAverage(arr1);
    double avg2 = calculateAverage(arr2);
    return avg1 > avg2;
  }

  // Method to check if it's hot outside and if there's enough money for a drink
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    return isHotOutside && moneyInPocket > 10.50;
  }
  public static String isCatOrDog (String sound){
    if (sound.equalsIgnoreCase("meow")) {
      return "Cat";
    } else if (sound.equalsIgnoreCase("woof")) {
      return "Dog";
    } else {
      return "Unknown animal";
    }
  }
}
