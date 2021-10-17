package aggregators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import fileprocessors.StockFileReader;

public class AggregatorProcessor <E1 extends Aggregator>{
	
	E1 objectE1;
	String filenameString;
	
	public AggregatorProcessor(E1 objectE1, String filenameString) {
		super();
		this.objectE1 = objectE1;
		this.filenameString = filenameString;
	}
	
	public double runAggregator(int index) throws IOException {
		double dval=1;
		StockFileReader fileReader = new StockFileReader(filenameString);
		List<String> lines =  fileReader.readFileData();
		index--;
		for (String line : lines) {
			String[] dataString=line.split(",");
			dval=Double.parseDouble(dataString[index]);
			objectE1.add(dval);
		}
		
		return objectE1.calculate();
		
	}
	
}
