package springMvcNOrm.Models;





import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Product {
private String pName;
private String pPrice;
private String pMfg;
private String pExpiry;


public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpPrice() {
	return pPrice;
}
public void setpPrice(String pPrice) {
	this.pPrice = pPrice;
}
public String getpMfg() {
	return pMfg;
}
public void setpMfg(String pMfg) {
	this.pMfg =  pMfg;
}
public String getpExpiry() {
	return pExpiry;
}
public void setpExpiry(String pExpiry) {
	this.pExpiry =  pExpiry;
}


@Override
public String toString() {
	return "Product [pName=" + pName + ", pPrice=" + pPrice + ", pMfg=" + pMfg + ", pExpiry=" + pExpiry + "]";
}




}
