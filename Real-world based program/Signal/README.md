# Signal Two-Way Program

This Java program calculates the total time taken to reach the destination while considering various factors like signal cycles (red and green), road types (one-way or two-way), and delays at each signal.

## Features
- Allows input for the number of signals.
- Customizable settings for each signal, such as time between signals, signal cycle (red and green times), road type (one-way or two-way), speed, and any delay at each signal.
- Calculates the total time taken based on the signal configurations and the speed provided.

## Program Workflow:
1. **Input Parameters:**
    - The user enters the number of signals.
    - The program asks whether all signals are placed at the same distance or not.
    - Red and green signal times are either fixed or customizable for each signal.
    - The user provides the road type (one-way or two-way) for each signal.
    - Speed options are available (normal, slow, fast) to simulate travel time.
    - If any delays are encountered at the signals, they are also inputted.

2. **Calculations:**
    - The program calculates the time to reach each signal based on the speed and delay.
    - It then evaluates the signal cycle (green + red) and adjusts the total time by checking the time passed against the signal cycle.
    - The final output is the total time taken to reach the destination.

## Instructions to Run the Program:
1. Compile the program using a Java compiler.
   - Command: `javac SignalTwoWay.java`
   
2. Run the compiled program.
   - Command: `java SignalTwoWay`
   
3. Follow the on-screen prompts to input the required values, such as the number of signals, distances, signal times, speed, and any delays.

4. The program will output:
   - The time taken between each signal.
   - The total time taken to reach the destination.

## Example Input 1:

    Enter the Number of signal :5
    
    Do all the signals have the same distance? (y or n):y
    Enter the time difference each signal and also time diff from last signal to the destination :8
    
    All the red and green signals have same time (y or n):y
    Enter the red signal time :5
    Enter the green signal time :5
    
    Does All the roads are two ways?(y-n) :y
    
    Enter the speed (1.0 for normal , 0.8 for slow , 1.1 for fast):1
    
    Is you will goes any time delay? (y or n) :n


    Time taken each signals [8, 8, 8, 8, 8, 8]
    red signal time [5, 5, 5, 5, 5]
    green signal time [5, 5, 5, 5, 5]
    road way [2, 2, 2, 2, 2]
    time delay [0, 0, 0, 0, 0]
    
    total time taken  to reach destination :58.0


## Example Input 2:

    Enter the Number of signal :5
    
    Do all the signals have the same distance? (y or n):n
    Enter the distance time between #0 : 5
    Enter the distance time between #1 : 6
    Enter the distance time between #2 : 4
    Enter the distance time between #3 : 6
    Enter the distance time between #4 : 3
    Enter the distance time between #5+ to the destination :5
    
    All the red and green signals have same time (y or n):n
    Enter the red signal time for signal 1 :2
    Enter the green signal time for signal 1 :5
    
    Enter the red signal time for signal 2 :3
    Enter the green signal time for signal 2 :5
    
    Enter the red signal time for signal 3 :3
    Enter the green signal time for signal 3 :5
    
    Enter the red signal time for signal 4 :2
    Enter the green signal time for signal 4 :5
    
    Enter the red signal time for signal 5 :2
    Enter the green signal time for signal 5 :4
    
    Does All the roads are two ways?(y-n) :n
    Enter the signal #1's road way :2
    Enter the signal #2's road way :3
    Enter the signal #3's road way :4
    Enter the signal #4's road way :3
    Enter the signal #5's road way :2
    
    Enter the speed (1.0 for normal , 0.8 for slow , 1.1 for fast):1.1
    
    Is you will goes any time delay? (y or n) :y
    Enter the time delay in signal #1 :2
    Enter the time delay in signal #2 :3
    Enter the time delay in signal #3 :4
    Enter the time delay in signal #4 :5
    Enter the time delay in signal #5 :6


    Time taken each signals [5, 6, 4, 6, 3, 5]
    red signal time [2, 3, 3, 2, 2]
    green signal time [5, 5, 5, 5, 4]
    road way [2, 3, 4, 3, 2]
    time delay [2, 3, 4, 5, 6]


    total time :22.0
    total time :45.0
    total time taken to reach destination  :59.8




## Contact Information:
- **Email**: [harishragavendra2305@gmail.com](mailto:harishragavendra2305@gmail.com)
- **LinkedIn**: [Harish Ragavendra](https://www.linkedin.com/in/harishragavendra23)

## Note:
- Make sure to input the values carefully to avoid incorrect calculations.
- You can experiment with different speed values (normal, slow, fast) to see how the total time is affected.
      
