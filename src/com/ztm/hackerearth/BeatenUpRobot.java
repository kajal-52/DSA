package com.ztm.hackerearth;
/**
 * Given an array of robots waking up time of robots
 *
 * arr= [5, 2, 4, 1, 4]
 * every robot takes time to wakeup as given in array
 * robot1 takes 5 seconds to wakeup robot2 takes 2 seconds to wakeup and so on.
 * after that every robot takes 1 seconds to move to other index like i-arr[i] and i+arr[i] if it is valid
 * yes only like i-arr[i] and i+arr[i]
 *
 * Now if a robot reaches at index before the robot at that index wakes up means he can beat that robot
output arr =[0, ]
 i=1
 robot wakes up in 5s
 then 1 second to move total time -= 5+1 =6s
 indexes he can move are = 1-5 =-5 invalid
                           1+5 = 6 invalid
 okay so we will 0 for robot 1 in array
 i=2
  2+1 =3s
 2-2= 0
 2+2=4

 */


import java.util.Scanner;

public class BeatenUpRobot {
    public static int[] ableToBeatRobot(int arr[]){
        int[] arr_1 = new int[10];
        return arr_1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t_case = scanner.nextInt();
        for (int i = 0; i < t_case; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i] =scanner.nextInt();
            }
            int res[]=ableToBeatRobot(arr);
        }
    }
}
