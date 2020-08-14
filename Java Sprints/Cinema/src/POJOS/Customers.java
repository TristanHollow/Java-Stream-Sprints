package POJOS;

import java.util.HashSet;
import java.util.Set;

public class Customers  implements java.io.Serializable {


     private int customerId;
     private String name;
     private String password;
     private String username;
     private Set bookingses = new HashSet(0);

    public Customers() {
    }

	
    public Customers(int customerId, String name, String password, String username) {
        this.customerId = customerId;
        this.name = name;
        this.password = password;
        this.username = username;
    }
    public Customers(int customerId, String name, String password, String username, Set bookingses) {
       this.customerId = customerId;
       this.name = name;
       this.password = password;
       this.username = username;
       this.bookingses = bookingses;
    }
   
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public Set getBookingses() {
        return this.bookingses;
    }
    
    public void setBookingses(Set bookingses) {
        this.bookingses = bookingses;
    }




}

