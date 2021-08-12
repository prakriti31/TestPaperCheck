package DA_2;

import java.lang.*;
import java.util.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Student {
    String sName;
    String regNo;
    int q1Marks;
    int q2Marks;
    int q3Marks;
    int total;

    public Student(String sName, String regNo, int q1Marks, int q2Marks, int q3Marks, int total) {
        this.sName = sName;
        this.regNo = regNo;
        this.q1Marks = q1Marks;
        this.q2Marks = q2Marks;
        this.q3Marks = q3Marks;
        this.total = total;
    }

    public String getsName() {

        return sName;
    }

    public void setsName(String sName) {

        this.sName = sName;
    }

    public String getRegNo() {

        return regNo;
    }

    public void setRegNo(String regNo) {

        this.regNo = regNo;
    }

    public int getQ1Marks() {

        return q1Marks;
    }

    public void setQ1Marks(int q1Marks) {

        this.q1Marks = q1Marks;
    }

    public int getQ2Marks() {

        return q2Marks;
    }

    public void setQ2Marks(int q2Marks) {

        this.q2Marks = q2Marks;
    }

    public int getQ3Marks() {

        return q3Marks;
    }

    public void setQ3Marks(int q3Marks) {

        this.q3Marks = q3Marks;
    }

    public int getTotal() {

        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }
}
