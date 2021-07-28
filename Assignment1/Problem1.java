
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
   

public class Problem1 {
	private void PrintOutput(String data) {
		String[] words = data.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("words.txt"));
			String s;
			
			while((s=br.readLine())!=null) {
				int cc = readingFile(data,s);
				map.put(s, cc);
			}
			br.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(map);
	}
	private int readingFile(String data,String findw) {
		int count=0;
		
//			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Documents\\Java Files\\WebData.txt"));
//			String Stemp=br.readLine();
			String[] words = data.split(" ");
			for(String x:words) {
				if(x.toLowerCase().contains(findw.toLowerCase())) {
					count++;
				}
			}
//			br.close();
			
		return count;
	}
	public void getdata() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("url.txt"));
			
			String s;
			while((s=br.readLine())!=null) {
//				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\hp\\Documents\\Java Files\\WebData.txt")));
				String output = Problem1.getUrlContents(s);
				output = output.replaceAll("<[^>]*>", "").replaceAll("(?m)^\\s+$", "").replaceAll("\\s", " ");
				PrintOutput(output);
//				bw.write(output);
				
//				bw.close();
			}
			
			br.close();
			
			  
		    
		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	 static String getUrlContents(String theUrl)  
	  {  
	    StringBuilder content = new StringBuilder();  
	  // Use try and catch to avoid the exceptions  
	    try  
	    {  
	      URL url = new URL(theUrl); // creating a url object  
	      URLConnection urlConnection = url.openConnection(); // creating a urlconnection object  
	  
	      // wrapping the urlconnection in a bufferedreader  
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));  
	      String line;  
	      // reading from the urlconnection using the bufferedreader  
	      while ((line = bufferedReader.readLine()) != null)  
	      {  
	        content.append(line + "\n");  
	      }  
	      bufferedReader.close();  
	    }  
	    catch(Exception e)  
	    { 
	    	
	      e.printStackTrace();  
	    }  
	    return content.toString();  
	  }  
}
