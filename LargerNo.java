import java.util.Scanner;
public class LargerNo {

	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
        int first= sc.nextInt();
        int second = sc.nextInt();

        if (first>second){
            System.out.println(first + ": is larger");
            
        } else{System.out.println(second + ": is larger");
        }
    }
	}

}
