package springMvc.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
private String User_name;
private String User_email;
private int User_pass;
//@DateTimeFormat(pattern = "yyyy-mm-dd")
//private LocalDate date;

//
//public LocalDate getDate() {
//	return date;
//}
//public void setDate(LocalDate date) {
//	this.date = date;
//}

public String getUser_name() {
	return User_name;
}
public void setUser_name(String user_name) {
	User_name = user_name;
}
public String getUser_email() {
	return User_email;
}
public void setUser_email(String user_email) {
	User_email = user_email;
}
public int getUser_pass() {
	return User_pass;
}
public void setUser_pass(int user_pass) {
	User_pass = user_pass;
}

@Override
public String toString() {
	return "Student [User_name=" + User_name + ", User_email=" + User_email + ", User_pass=" + User_pass +  "]";
}



}
