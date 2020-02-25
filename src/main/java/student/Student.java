
package student;

/**
 *
 * @author java
 */
public class Student {

   private String firstname;
   private String lastname;
   private int yearOfBirth;
    private String getFirstName;
    
    public String getFirstname(){
       return this.firstname;
   }
   
    public void setFirstname(String customFirstname){
       this.firstname = customFirstname;
   }
    
    public String getLastname(){
       return this.lastname;
   }
   
    public void setLastname(String customLastname){
       this.lastname = customLastname;
   } 
   
    public int getYearOfBirth(){
       return this.yearOfBirth;
   }
   
    public void setYearOfBirth(int customYearOfBirth){
       this.yearOfBirth = customYearOfBirth;
   }
   
    public Student(){
        this.firstname = "not defined";
        this.lastname = "not defined";
        this.yearOfBirth = 0;
        
    }
    
    public Student(String firstName, String lastName, int yearOfBirth){
        this.firstname = firstName;
        this.lastname = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
   public void showdata(){
        System.out.println("First Name: " + this.getFirstname());
        System.out.println("Last Name: " + this.getLastname());
        System.out.println("Year of Birth " + this.getYearOfBirth());
        
   }
    
    
    public static void main(String[] args) {
        
              
    }
    
}
