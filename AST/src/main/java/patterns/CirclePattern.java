package patterns;


	import java.util.Scanner;

	public class CirclePattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius of circle: ");
	        int radius = sc.nextInt();
	        sc.close();

	        for (int i = -radius; i <= radius; i++) {
	            for (int j = -radius; j <= radius; j++) {
	                double distance = Math.sqrt(i * i + j * j);
	                if (distance > radius - 0.5 && distance < radius + 0.5) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

