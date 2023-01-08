package dataDrivenFramework;

import org.testng.annotations.DataProvider;

public class SubclassDataprovider  {

	
/*	  public String[][] credentials(){
	  String[][]values=new String[1][2];
	  
	  values[0][0]="sakthipradeep555@gmail.com"; 
	  values[0][1]="6382150895"; 
	  return values; }*/
	 
	// for DataProviderINTEGRATIONwithExcell
	  @DataProvider(name="hi") 

	  public String[][] credentials(){
		  String[][]Excell1=ExcellIntegation.method1(String []);
		return Excell1;
	  }

		
}
