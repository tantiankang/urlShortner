import javax.swing.JOptionPane;

import java.util.*;



public class urlClass {
	
	HashMap hm = new HashMap();
	public urlClass()
	{
		String urlInput = JOptionPane.showInputDialog(null, "Please input the url that you want to shorten.");
		
		String uuid = UUID.randomUUID().toString();
		String cut = uuid.substring(0, 6);
		
		// Since to store data , we need a database, however a
		//database is not installed with eclipse although we
		//have the JDBC api. Therefore , i store the data into hashmap
		hm.put(urlInput, cut);
		Iterator i = hm.entrySet().iterator();
		
			Map.Entry me = (Map.Entry)i.next();
			JOptionPane.showMessageDialog(null, "Your shortened url for "+me.getKey()+" is short.com/"+me.getValue());
	}

}
