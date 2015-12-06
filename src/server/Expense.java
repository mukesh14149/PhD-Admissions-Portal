package server;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

public class Expense {
  private StringProperty firstName;
  private StringProperty lastName;
  private  StringProperty link;

  public Expense(String firstName, String lastName,String link) {
    setFirstName(firstName);
    setLastName(lastName);
    setlink(link);
  }

  public final void setFirstName(String value) { firstNameProperty().set(value); }
  public final void setLastName(String value) { lastNameProperty().set(value); }
  public final void setlink(String value) { linkProperty().set(value); }
  public String getFirstName() { return firstNameProperty().get(); }
  public String getLastName() { return lastNameProperty().get() ;}
  public String getLinktName() { return linkProperty().get() ;}
  
  public StringProperty firstNameProperty() {
    if (firstName == null) firstName = new SimpleStringProperty(this, "firstName");
    return firstName;
  }
  public StringProperty lastNameProperty() {
    if (lastName == null) lastName = new SimpleStringProperty(this, "lastName");
    return lastName;
  }
  public StringProperty linkProperty() {
	    if (link == null) link = new SimpleStringProperty(this, "link");
	    return link;
	  }
   
}