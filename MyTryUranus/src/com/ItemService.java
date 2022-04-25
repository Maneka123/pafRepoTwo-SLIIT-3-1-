package com; 
import model.Employee;

import model.Employee; 
//For REST Service
import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType; 
//For JSON
import com.google.gson.*; 
//For XML
import org.jsoup.*; 
import org.jsoup.parser.*; 
import org.jsoup.nodes.Document; 
@Path("/Items") 
public class ItemService 
{ 
 Employee itemObj = new Employee(); 
@GET
@Path("/") 
@Produces(MediaType.TEXT_HTML) 
public String readItems() 
 { 
 return ( itemObj.readOfficialDetails() +"<br>"+ itemObj.readContactDetails()+"<br>"+ itemObj.readSalaryDetails()+"<br>"+ itemObj.readLeaveDetails()+"<br>"+ itemObj.readTimeSheetDetails());
 } 




@POST
@Path("/one") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertItemOne(@FormParam("firstname") String f, 
 @FormParam("lastname") String l, 
 @FormParam("date") String d, 
 @FormParam("gender") String g,
 @FormParam("fatherName") String fa,
 @FormParam("motherName") String m,
 @FormParam("designation") String de,
 @FormParam("department") String dep)
 
{ 
 String output = itemObj.insertItemOne(f,l,d,g,fa,m,de,dep); 
return output; 
}


@POST
@Path("/two") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertEmpTwo(@FormParam("a") String f, 
 @FormParam("b") String l, 
 @FormParam("c") String d, 
 @FormParam("d") String g,
 @FormParam("e") String fa,
 @FormParam("f") String m,
 @FormParam("g") String de,
 @FormParam("h") String dep)
 
{ 
 String output = itemObj.insertEmpTwo(f,l,d,g,fa,m,de,dep); 
return output; 
}

@POST
@Path("/three") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertSalary(@FormParam("i") String f, 
 @FormParam("j") String l, 
 @FormParam("k") String d, 
 @FormParam("l") String g
 )
 
{ 
 String output = itemObj.insertSalary(f,l,d,g); 
return output; 
}

@POST
@Path("/four") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertLeave(@FormParam("m") String f, 
 @FormParam("n") String l, 
 @FormParam("o") String d, 
 @FormParam("p") String g,
 @FormParam("q") String q
 )
 
{ 
 String output = itemObj.insertLeave(f,l,d,g,q); 
return output; 
}


@POST
@Path("/five") 
@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
@Produces(MediaType.TEXT_PLAIN) 
public String insertTimesheet(@FormParam("r") String f, 
 @FormParam("s") String l, 
 @FormParam("t") String d, 
 @FormParam("u") String g,
 @FormParam("v") String q
 )
 
{ 
 String output = itemObj.insertTimesheet(f,l,d,g,q); 
return output; 
}

@PUT
@Path("/") 
@Consumes(MediaType.APPLICATION_JSON) 
@Produces(MediaType.TEXT_PLAIN) 
public String updateSalary(String itemData) 
{ 
//Convert the input string to a JSON object 
 JsonObject itemObject = new JsonParser().parse(itemData).getAsJsonObject(); 
//Read the values from the JSON object
 String e= itemObject.get("salID").getAsString(); 
 String a = itemObject.get("Empemail").getAsString(); 
 String b = itemObject.get("month").getAsString(); 
 String c = itemObject.get("year").getAsString(); 
 String d = itemObject.get("amount").getAsString(); 
 
 String output = itemObj.updateSalary(a,b,c,d,e); 
return output; 
}
@DELETE
@Path("/") 
@Consumes(MediaType.APPLICATION_XML) 
@Produces(MediaType.TEXT_PLAIN) 
public String deleteItem(String itemData) 
{ 
//Convert the input string to an XML document
 Document doc = Jsoup.parse(itemData, "", Parser.xmlParser()); 
 
//Read the value from the element <itemID>
 String itemID = doc.select("itemID").text(); 
 String output = itemObj.deleteItem(itemID); 
return output; 
}



}
