package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class User {
	
	////////// Properties
	private int userId;
	@NotNull()
	@Size(min=5, max=50)
	private String firstName;
	@NotNull()
	@Size(min=5, max=50)
	private String lastName;
	@NotNull()
	@Size(min=5, max=50)
	private String username;
	@NotNull()
	@Size(min=5, max=50)
	private String password;
	@NotNull()
	@Size(min=5, max=50)
	private String email;
	
	///////// Constructors
	public User() {
		this.userId = 0;
		this.firstName = "";
		this.lastName = "";
		this.username = "";
		this.password = "";
		this.email = "";
	}
	
	public User(int id, String fName, String lName, String uName, String pass, String email) {
		this.userId = id;
		this.firstName = fName;
		this.lastName = lName;
		this.username = uName;
		this.password = pass;
		this.email = email;
	}

	////////// Getters and Setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	////////// ToString() method
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", email=" + email + "]";
	}
}
