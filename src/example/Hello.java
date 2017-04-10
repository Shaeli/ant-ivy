
package example;
import org.apache.commons.lang.WordUtils;
import java.util.List;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
		Hello app = new Hello();
        int myMax = 0;
        String filename ="data.csv";
        try {
            CSVReader reader = new CSVReader(new FileReader("data.csv"));
			List<String[]> myEntries=reader.readAll();
			for(String[] entry : myEntries){
				int nb = Integer.parseInt(entry[0]);
				System.out.println(String.format("Nombre lu : %d", nb));
				System.out.println(String.format("Nb max entre %d et %d est %d",myMax,nb,app.max(myMax, nb)));
				myMax=app.max(myMax,nb);
			}
			System.out.println("le maximum est :"+myMax);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
      public int max(int a, int b){
    	return a > b ? a : b;
    }

    
}
 //try catch a faire        