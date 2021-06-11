package readingAndWritingTheFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WritingTheFile {
	
//	public void writingTheFile() throws IOException
//	{
//		File file=new File("C:\\Users\\Vasu\\manualandautomation\\11-6-2021\\abc.txt");
//		FileOutputStream fos =new FileOutputStream(file);//stored in the form of bytes
//		String str="I am learning java";
//		byte[] bytess = str.getBytes();//coverting string  in the form of bytes and storing in the variable bytess
//		fos.write(bytess);//writing the data into bytes
//		System.out.println("i have written data in the abc.txt file");
//		
//	}
//	
	
	public void readingTheData() throws IOException
	{
		File file=new File("C:\\Users\\Vasu\\manualandautomation\\11-6-2021\\abc.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bfr=new BufferedReader(fileReader);
		String str;
		if((str=bfr.readLine())!=null)
		{
			System.out.println("I am printing the dat in the console"+str);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WritingTheFile wrtfile=new WritingTheFile();
		//wrtfile.writingTheFile();
		wrtfile.readingTheData();
	}

}
