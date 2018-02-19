import java.util.ArrayList;
import java.util.Scanner;

public class NRequests {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = in.nextInt();
		
		for(int i=0; i<n; i++){

			int request = in.nextInt();
			
			if(request == 1){
				list.add(in.nextInt());
				System.out.println(list);
			}
			
			if(request == 2){				
				double remove = in.nextInt();
				for(int j = 0; j < list.size(); j++)
				{
					if(list.get(j) == remove){ 
						list.remove(j); 
						j = 0;  
					}
				}
				System.out.println(list);
			}
			
			if(request == 3){
				System.out.println(list.size());
			}
			
		}
		
		in.close();
	}
			
}


