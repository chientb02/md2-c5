package baiTap.accessModifier;

public class Main {
    public static void main(String[] args) {
        Circle circle =  new Circle();
        Circle circle1 =  new Circle(1.5);
        System.out.println("bán kính ban đầu là:  "+ circle.getRadius());
        System.out.println("bán kính sau nhập là:  "+ circle1.getRadius());
        System.out.println("Diện tích ban đầu là:  " +circle.getArea());
        System.out.println("Diện tích sau nhâpj là :  "+circle1.getArea());

    }
}
