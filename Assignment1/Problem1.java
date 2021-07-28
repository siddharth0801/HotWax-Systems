

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
   

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
//		System.out.println(map.values());
		ArrayList<Integer> sortedV = new ArrayList<Integer>(map.values());
		Collections.sort(sortedV);
//		System.out.println(map);
//		System.out.println(sortedV);
		int len = sortedV.size();
		for(int i=len-1;i>len-4;i--) {
			for(String x:map.keySet()) {
				if(map.get(x)==sortedV.get(i)) {
					
					System.out.println(x+" "+map.get(x));
					map.remove(x);
					break;
				}
			}
		}
		System.out.println();
	}
	private int readingFile(String data,String findw) {
		int count=0;
		
//			BufferedReader br = new BufferedReader(new FileReader("WebData.txt"));
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
//				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("WebData.txt")));
				String output = getUrlContents(s);
				output = output.replaceAll("<[^>]*>", "").replaceAll("(?m)^\\s+$", "").replaceAll("\\s", " ");
				System.out.println("URL: "+s);
//				System.out.println("words"+" occurence");
				PrintOutput(output);
//				bw.write(output);
				
//				bw.close();
			}
			
			br.close();
			
			  
		    
		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	 private String getUrlContents(String theUrl)  
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
