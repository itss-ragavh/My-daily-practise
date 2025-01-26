package thirdround;
import java.util.Arrays;
import java.util.Scanner;

public class SignalTwoWay {
    static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.print("Enter the Number of signal :");
		int signal=sc.nextInt();
		
		int[]time_taken=new int[signal+1];
        int[]red_signal_time=new int[signal];
        int[]green_signal_time=new int[signal];
        int[]road_way=new int[signal];
        double speed;
        int[]delay_time=new int[signal];
        double total_time=0;

		System.out.print("Do all the signals have the same distance? (y or n):");
		 switch (sc.next().
				 charAt(0))
		
		{
		case 'y','Y':{
            System.out.print("Enter the time difference each signal and also time diff from last signal to the destination :");
			Arrays.fill(time_taken,sc.nextInt());
			break;}
		case 'n','N':{
			for (int i = 0; i < time_taken.length; i++) {
				if(i!=time_taken.length-1){
                    System.out.print("Enter the distance time between #"+i+" : ");
                }	
                else{
                    System.out.print("Enter the distance time between #"+i+"+ to the destination :");
                }
                time_taken[i]=sc.nextInt();
			}
			break;
		}
		default:{
			System.out.println("Enter the value correctly!!!");
			return;
			}
		
		}//switch1 ends
        System.out.print("All the red and green signals have same time (y or n):");
        switch (sc.next().charAt(0)) {
            case 'y','Y':
                { 
                    System.out.print("Enter the red signal time :");
                    Arrays.fill(red_signal_time,sc.nextInt());
                    System.out.print("Enter the green signal time :");
                    Arrays.fill(green_signal_time, sc.nextInt());
                    break;
                }
            case 'n','N':
            {
                for (int i = 0; i < red_signal_time.length; i++) {
                    System.out.print("Enter the red signal time for signal "+(i+1)+" :");
                    red_signal_time[i]=sc.nextInt();
                    System.out.print("Enter the green signal time for signal "+(i+1)+" :");
                    green_signal_time[i]=sc.nextInt();
                }
                break;
            }
            
            default:
            {
                System.out.println("Enter the value correctly!!!");
                return;
            }
        }//switch2 closed

        System.out.print("Does All the roads are two ways?(y-n) :");
        switch (sc.next().charAt(0)) {
            case 'y','Y':
                {
                    Arrays.fill(road_way, 2);
                    break;
                }
            case 'n','N':
                {
                    for (int i = 0; i < road_way.length; i++) {
                     System.out.print("Enter the signal #"+(i+1)+"'s road way :");   
                     road_way[i]=sc.nextInt();
                    }
                    break;
                }
            default:
                {
                System.out.println("Enter the value correctly!!!");
                return;}
        }//switch3 ends

        System.out.print("Enter the speed (1.0 for normal , 0.8 for slow , 1.1 for fast):");
        speed = sc.nextDouble();


        System.out.print("Is you will goes any time delay? (y or n) :");
        switch (sc.next().charAt(0)) {
            case 'y','Y':
                {
                    for (int i = 0; i < delay_time.length; i++) {
                        System.out.print("Enter the time delay in signal #"+(i+1)+" :");
                        delay_time[i]=sc.nextInt();
                    }
                break;
                }
            case 'n','N':{
                Arrays.fill(delay_time,0);
                break;
            }
            default:{
                System.out.println("Enter the value correctly!!!");
                return;}
        }//switch4 ends
		
		System.out.println("\n");
        System.out.println("Time taken each signals "+Arrays.toString(time_taken));
        System.out.println("red signal time "+Arrays.toString(red_signal_time));
        System.out.println("green signal time "+Arrays.toString(green_signal_time));
        System.out.println("road way "+Arrays.toString(road_way));
        System.out.println("time delay "+Arrays.toString(delay_time));
		System.out.println("\n");
		
		for (int i=0;i<signal;i++)
		{
			double time_to_signal=(time_taken[i]*speed)+delay_time[i];
            double time_total_temp=time_to_signal+total_time;
            double time_minus=time_total_temp;
            int signal_cycle_time=green_signal_time[i]+(red_signal_time[i]*(road_way[i]-1));
            while (time_minus>signal_cycle_time) {
                time_minus-=signal_cycle_time;
            }
            if (time_minus>green_signal_time[i]) {
                int temp_signal_time=signal_cycle_time;
                while (signal_cycle_time<time_total_temp) {
                    signal_cycle_time+=temp_signal_time;
                }
                total_time=signal_cycle_time;
                System.out.println("total time :"+total_time);
                continue;
            }
            total_time += time_to_signal;
		}
        total_time+= time_taken[signal]*speed;
        System.out.println("total time taken :" + total_time);

            
    
   }
}
