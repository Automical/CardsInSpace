
import java.net.*;
import java.io.*;

public class net
{
    private String url = "http://www.oracle.com/";
    URL website;
    
    public net() throws Exception {
        website = new URL(url);
    }
    
    public void connect() throws Exception {
    
        URLConnection yc = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close(); 
        
    }
}
