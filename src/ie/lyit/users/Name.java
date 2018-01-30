/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;

/**
 *
 * @author Jim
 */
public class Name {
    
    // Instance variables
    String fName;
    String sName;
    String title;
    
    // Constructors
    public Name(){
    fName=sName=title = null;
    }
    
    public Name(String fName,String sName,String title){
    this.fName = fName;
    this.sName = sName;
    this.title = title;
    
    }
    // Getter's
    public String getFirstName(){
    return fName;
    }
    public String getSurname(){
    return sName;
    }
    public String getTitle(){
    return title;
    }
    
    // Setter's
    public void setTitle(String setTitleTo){
	   title=setTitleTo;
	}
	public void setFirstName(String setFirstNameTo){
	   fName=setFirstNameTo;
	}
	public void setSurname(String setSurnameTo){
	   sName=setSurnameTo;
	}
    
    // To string method
    @Override
    public String toString(){
    return "Title:"+title+"\nFirst Name:"+fName+"\nSurname:"+sName;
    }
    
    @Override
	public boolean equals(Object obj){
	   Name nObject;
	   if (obj instanceof Name)
	      nObject = (Name)obj;
	   else
	       return false;
	 
	   return this.title.equals(nObject.title)
	          && this.fName.equals(nObject.fName)
	          && this.sName.equals(nObject.sName);
	}
    
}
