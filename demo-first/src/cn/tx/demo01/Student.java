package cn.tx.demo01;

public class Student {
    private int sNo;
    private String name;
    private int age;

    public Student(int sNo, String name, int age) {
        this.sNo = sNo;
        this.name = name;
        this.age = age;

        /**Alt+Enter*/
        long round = Math.round(1.5);
        long round1 = Math.round(1.6);
    }
    /**
     * 先使用 alt + insert 快捷键弹出单页面
     * Constructor 生成构造方法
     * Getter and Setter 生成get 和 set 方法
     * toString() 生成toString方法
     * Override Methods... 重写父类的方法
     *
     *快捷键
     * Ctrl+B 进入光标所在的方法/变了的接口或是定义处，等效于Ctrl+右键单击
     * Ctrl+D 复制光标所在行或者复制选择内容，变把复制内容插入光标位置下面
     * Ctrl+F 在当前文件查找
     * ctrl+H 查看累的继承结构
     * ctrl+N 通过类名定为文件
     * ctrl+O 快速重写父类方法
     * ctrl+X 剪切所在行
     * ctrl+Y 删除光标所在行或者删除选中的行
     * ctrl+z 撤销
     * ctrl+W 递进式选择代码块
     * ctrl+F12 单出当前文件结构层，
     * ctrl+Space 基础代码补全
     * ctrl+/ 注释光标所在代码
     * ctrl+shift+/ 多行注释
     *
     * */

    /**
     * Alt+Enter 根据光标所在问题，提示快速修复选择 用的最多的是生成变量
     *
     */

    /**
     * Ctrl+Alt+B 在某个调用的方法名上使用会跳转到具体的实现处
     * Ctrl+Alt+L 格式化代码 可以对当前文件和整个包目录使用
     * Ctrl+Alt+T 对选中的代码弹出循环选项单出层
     * Ctrl+Alt+左方向键  退回到上一次操作的地方
     * Ctrl+Alt+右方向键  退回到上一次操作的地方
     */

    /**
     *Ctrl+Shift+R 根据输入的内容替换对应内容
     * Ctrl+Shif+U 对选中的代码进行大小写转换
     * Ctrl+Shift+Z 取消撤销，
     */
}
