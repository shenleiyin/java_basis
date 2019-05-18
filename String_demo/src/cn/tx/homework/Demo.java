package cn.tx.homework;

public class Demo {
    public static void main(String[] args) {
        String s = "lifsdalgilisdfjlaslisdalgiiligsdasdlisadg";
        //定义一个计数器
        int count = 0;
        //获得第一个li 的index
        int index = s.indexOf("li");
        while (index!=-1){
            //给计数器累加
            count++;
            //查找下一次的索引，变且更新索引
            index=s.indexOf("li",index+2);
        }
        System.out.println(count);
    }
}
