package cn.tx.demo2;

import java.util.Date;

public class MyFile {
    private String extendsName;
    private Date last_mode;
    private long fsize;
    private String fname;

    public MyFile(String extendsName, Date last_mode, long fsize, String fname) {
        this.extendsName = extendsName;
        this.last_mode = last_mode;
        this.fsize = fsize;
        this.fname = fname;
    }

    public String getExtendsName() {
        return extendsName;
    }

    public void setExtendsName(String extendsName) {
        this.extendsName = extendsName;
    }

    public Date getLast_mode() {
        return last_mode;
    }

    public void setLast_mode(Date last_mode) {
        this.last_mode = last_mode;
    }

    public long getFsize() {
        return fsize;
    }

    public void setFsize(long fsize) {
        this.fsize = fsize;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
