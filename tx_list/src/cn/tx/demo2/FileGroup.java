package cn.tx.demo2;

import java.util.ArrayList;
import java.util.List;

public class FileGroup {
    //文件名
    private String  extendsName;
    //文件个数
    private int cont;

    private List<MyFile> fileList=new ArrayList<>();

    public String getExtendsName() {
        return extendsName;
    }

    public List<MyFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<MyFile> fileList) {
        this.fileList = fileList;
    }

    public FileGroup() {

    }

    public String FileGroup() {
        return extendsName;
    }

    public void setExtendsName(String extendsName) {
        this.extendsName = extendsName;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public FileGroup(String extendsName, int cont) {
        this.extendsName = extendsName;
        this.cont = cont;
    }
}
