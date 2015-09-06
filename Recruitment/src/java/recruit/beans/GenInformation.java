/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.beans;


/**
 *
 * @author sups
 */
public class GenInformation {

    private String fname;
    private String lname;
    private String mname;
    private String sex;
    private String dob;

    public GenInformation() {
    }

    public GenInformation(String fname, String lname, String mname, String sex, String dob) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.sex = sex;
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

   

    
}
