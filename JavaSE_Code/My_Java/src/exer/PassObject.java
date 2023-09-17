package exer;

public class PassObject {

    public static void main(String[] args) {
        PassObject test=new PassObject();
        Circle c=new Circle();
        test.PrintAreas(c,5);
    }

    public void PrintAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");

        //设置圆的半径
        for (int i=1;i<=time;i++)
        {
            c.radius=i;

            System.out.println(c.radius+"\t\t"+c.findArea());
        }
    }
}
