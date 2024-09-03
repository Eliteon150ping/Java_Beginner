
package Chapter_9.Exercise_9_1;


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
}
