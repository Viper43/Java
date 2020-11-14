import java.util.*;
import java.io.*;
class fileaccess {

    public static void main(String args[]) throws FileNotFoundException, IOException, NoSuchElementException {

        Scanner sc = new Scanner(new File("E:\\abc.txt"));
        
		FileWriter f = new FileWriter("E:\\def.txt");
		while(sc.hasNextLine()) {
			System.out.println(sc.next());
			f.write(sc.next());
		}
        sc.close();
        f.close();
    }
}