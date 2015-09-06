/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.beans;

/**
 *
 * @author sups
 */
public class ContactDetail {

private String email;
private String address;
private String city;
private String state;
private String pin;
private String phone;
private String mobile;

    public ContactDetail() {
    }

    public ContactDetail(String email, String address, String city, String state, String pin, String phone, String mobile) {
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.phone = phone;
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
