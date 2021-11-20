package zipcode.country.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import zipcode.country.model.zipcodes;
@Component

public class ZipCodesAdding {
	

	private static List<zipcodes> zlist=new ArrayList<>();
	//static block   
		static  
		{  
		//adding zipcodes to the list  
		zlist.add(new zipcodes(508213, "Hyderabad","TS","INDIA"));
		zlist.add(new zipcodes(508222, "Banglore","KA","INDIA"));
		zlist.add(new zipcodes(508214, "Chennei","TM","USA"));
		zlist.add(new zipcodes(567890, "Mumbai","MH","UK"));
		
		} 
		//method that retrieve all users from the list  
		public List<zipcodes> findAll()  
		{  
		return zlist;  
		} 
  
		//method that find a particular user from the list  
		public zipcodes findOne(int id) {
			for(zipcodes zlist:zlist)  
			{  
				if(zlist.getZipcode()==id)  
					return zlist;  
			}  
			return null;  
		}  

}

