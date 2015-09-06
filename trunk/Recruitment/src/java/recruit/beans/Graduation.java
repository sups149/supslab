/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.beans;

/**
 *
 * @author sups
 */
public class Graduation {
private String degree;
private String branch;
private String college;
private String university;
private String yrp3;
private String me;
private String marks3;

    public Graduation() {
    }

    public Graduation(String degree, String branch, String college, String university, String yrp3, String me, String marks3) {
        this.degree = degree;
        this.branch = branch;
        this.college = college;
        this.university = university;
        this.yrp3 = yrp3;
        this.me = me;
        this.marks3 = marks3;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMarks3() {
        return marks3;
    }

    public void setMarks3(String marks3) {
        this.marks3 = marks3;
    }

    public String getMe() {
        return me;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYrp3() {
        return yrp3;
    }

    public void setYrp3(String yrp3) {
        this.yrp3 = yrp3;
    }

}
