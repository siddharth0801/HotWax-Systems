

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
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
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
		

			String[] words = data.split(" ");
			for(String x:words) {
				if(x.toLowerCase().contains(findw.toLowerCase())) {
					count++;
				}
			}
;
			
		return count;

	}

	public void getdata() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("url.txt"));
			
			String s;
			while((s=br.readLine())!=null) {

				String output = getUrlContents(s);
				output = output.replaceAll("<[^>]*>", "").replaceAll("(?m)^\\s+$", "").replaceAll("\\s", " ");
				System.out.println("URL: "+s);

				PrintOutput(output);

			}
			
			br.close();

		} catch (IOException e) {
			
			System.out.println(e);
		}
	}
	
	 private String getUrlContents(String theUrl)  
	  {  
	    StringBuilder content = new StringBuilder();  
 
	    try  
	    {  
	      URL url = new URL(theUrl); // creating a url object  
	      URLConnection urlConnection = url.openConnection(); // creating a urlconnection object  
	  
	        
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
	    	
	      System.out.println(e);  
	    }  
	    
	    return content.toString();  
	  }  
}
