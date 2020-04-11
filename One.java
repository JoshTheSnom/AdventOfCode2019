import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class One {
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		BufferedReader reader;
		int result = 0;
		try {
			reader = new BufferedReader(new FileReader("Input1.txt"));
			String line = reader.readLine();
			while (line != null) {
				int mass = Integer.parseInt(line);
				
				result += calcFuel(mass);
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

	public static int calcFuel(int aMass) {
		int fuel = 0;
		int totFuel = 0;
		do {
			fuel = (aMass/3)-2;
			if(fuel > 0) {
				aMass = fuel;
				totFuel += aMass;
			}
		}while(fuel > 0);
		return totFuel;
	}
}