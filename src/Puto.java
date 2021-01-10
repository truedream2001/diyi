public class Puto {
    public static void main(String[] args) {
        Stu stu  = new Stu("大数据");
        stu.setId(2016120025);
        stu.setName("张三");

        Stu stu01  = new Stu("计算机");
        stu01.setId(2012520025);
        stu01.setName("王五");
        System.out.println("学号："+stu.getId()+"\n姓名："+stu.getName()+"\n专业："+stu.getZye());
        System.out.println("学号："+stu01.getId()+"\n姓名："+stu01.getName()+"\n专业："+stu01.getZye());
    }
}
