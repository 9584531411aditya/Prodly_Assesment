package dataFile;

public class dataFile {
Xls_Reader d = new Xls_Reader (".//src//main//java//dataFile//DataFile.xlsx");
	
	public String browser = d.getCellData("Sheet1", 1, 1);
	public String firName=d.getCellData("Sheet1", 1, 2);
	public String lasName=d.getCellData("Sheet1", 1, 3);
	public String sex =d.getCellData("Sheet1", 1, 4);
	public String experience =d.getCellData("Sheet1", 1, 5);
	public String date =d.getCellData("Sheet1", 1, 6);
	public String profession=d.getCellData("Sheet1", 1, 7);
	public String flavoursofSelenium =d.getCellData("Sheet1", 1, 8);
	public String continents=d.getCellData("Sheet1", 1, 9);
	public String seleniumCommands=d.getCellData("Sheet1", 1, 10);

}
