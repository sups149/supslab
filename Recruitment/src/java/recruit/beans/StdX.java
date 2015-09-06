/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.beans;

/**
 *
 * @author sups
 */
public class StdX {
private String yrp1;
private String boardx;
private String marks1;

    public StdX() {
    }

    public StdX(String yrp1, String boardx, String marks1) {
        this.yrp1 = yrp1;
        this.boardx = boardx;
        this.marks1 = marks1;
    }

    public String getBoardx() {
        return boardx;
    }

    public void setBoardx(String boardx) {
        this.boardx = boardx;
    }

    public String getMarks1() {
        return marks1;
    }

    public void setMarks1(String marks1) {
        this.marks1 = marks1;
    }

    public String getYrp1() {
        return yrp1;
    }

    public void setYrp1(String yrp1) {
        this.yrp1 = yrp1;
    }


}
