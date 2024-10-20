# Average Calculator for Numbers Divisible by 3 and 4

## Overview

This Java program calculates the average of all numbers less than a user-specified value that are divisible by both 3 and 4. The user is prompted to enter a number, and the program iterates from 0 up to that number, summing all values divisible by both 3 and 4, and then calculates their average.

## How It Works

- The user is asked to enter a limit value (`sayi`), which defines the range for the calculation.
- The program iterates through all numbers from `0` to the entered number (`sayi`), and checks if each number is divisible by both `3` and `4`.
- If a number is divisible by both `3` and `4`, it is added to the total sum, and a counter (`sayac`) is incremented.
- After iterating through all numbers, the program calculates the average by dividing the total sum (`toplam`) by the counter (`sayac`).
- The program prints the result to the user.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter the limit value when prompted, and the program will display the average of numbers divisible by 3 and 4.

## Example Output

```
Kaça kadar gitmek istiyorsunuz:
30
30 ya kadar olan 3 ve 4 ile tam bölünen sayıların ortalaması:  9.0
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the terms and conditions that were set in the template. Adjust as needed.

