import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class One {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		BufferedReader reader;
		int result = 0;
		boolean stop = false;
		try {
			reader = new BufferedReader(new FileReader(
					"Input1.txt"));
			String line = reader.readLine();
			while (line != null) {
				int mass = Integer.parseInt(line);
				int fuel = 0;
				int totalfuel = 0;
				do {
					fuel = mass/3;
					fuel = fuel-2;
					if(fuel > 0) {
						mass = fuel;
						totalfuel = totalfuel + mass;
					}
				}while(fuel > 0);
				result = result + totalfuel;
				numbers.add(result);
				// read next line
				line = reader.readLine();
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
	}
}