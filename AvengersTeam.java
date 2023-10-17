import java.util.*;

public class AvengersTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] powers = new int[n];
        for (int i = 0; i < n; i++) {
            powers[i] = scanner.nextInt();
        }
        
        long difference = calculateDifference(n, powers);
        System.out.println(difference);
    }
    
    public static long calculateDifference(int n, int[] powers) {
        Arrays.sort(powers); // Sort the powers in ascending order
        
        long difference = 0;
        int turn = 1; // 1 for Captain America, -1 for Iron Man
        
        for (int i = n - 1; i >= 0; i--) {
            difference += turn * powers[i];
            turn *= -1; // Switch turns
        }
        
        return difference;
    }
}
