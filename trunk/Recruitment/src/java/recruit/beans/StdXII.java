/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.beans;

/**
 *
 * @author sups
 */
public class StdXII {
private String yrp2;
private String boardxii;
private String marks2;

    public StdXII() {
    }

    public StdXII(String yrp2, String boardxii, String marks2) {
        this.yrp2 = yrp2;
        this.boardxii = boardxii;
        this.marks2 = marks2;
    }

    public String getBoardxii() {
        return boardxii;
    }

    public void setBoardxii(String boardxii) {
        this.boardxii = boardxii;
    }

    public String getMarks2() {
        return marks2;
    }

    public void setMarks2(String marks2) {
        this.marks2 = marks2;
    }

    public String getYrp2() {
        return yrp2;
    }

    public void setYrp2(String yrp2) {
        this.yrp2 = yrp2;
    }
   

}
