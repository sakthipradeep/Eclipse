package learn;

public class DPSubclass {

	@org.testng.annotations.DataProvider(name="hi")
	public String[][] testData(){
	 String[][]values=new String[2][4];
	values[0][0]="testleaf";
	values[0][1]="hari";
	values[0][2]="r";
	values[0][3]="99";

	values[1][0]="testleaf";
	values[1][1]="vidya";
	values[1][2]="r";
	values[1][3]="909";


	return values;
	}
}
