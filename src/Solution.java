public class Solution {

    public static void main(String[] args) {
        Bus b1 = new Bus(30, 1000, "Running");
        Bus b2 = new Bus(30, 1000, "Running");
        System.out.println(b1.getNum());
        System.out.println(b2.getNum());
        Taxi t1 = new Taxi(4, 3000, "Normal");
        Taxi t2 = new Taxi(4, 3000, "Normal");
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
        System.out.println();

        System.out.println(b2.boardPassengers(2));
        b2.changeGas(-50);
        System.out.println(b2.getStatus());
        b2.changeStatus();
        System.out.println(b2.getStatus());
        System.out.println(b2.getSpeed());
        b2.changeGas(10);
        System.out.println(b2.boardPassengers(45));
        System.out.println(b2.getStatus());
        System.out.println(b2.boardPassengers(5));
        b2.changeGas(-55);
        System.out.println();

        System.out.println(t1.boardPassengers(2, "서울역", 2));
        t1.changeGas(-80); // 도착
        System.out.println("주유량: " + t1.getGas());
        System.out.println(t1.getSpeed());
        t1.payFee();
        System.out.println("누적 요금: " + t1.getTotalFee());
        System.out.println(t1.boardPassengers(5, "서울역", 2));
        System.out.println(t1.getSpeed());
        System.out.println(t1.boardPassengers(3, "구로디지털단지역", 12));
        System.out.println(t1.getSpeed());
        System.out.println(t1.changeSpeed(50));
        System.out.println(t1.getSpeed());
        t1.changeGas(-20); // 도착
        System.out.println("주유량: " + t1.getGas());
        System.out.println(t1.getSpeed());
        t1.payFee();
        System.out.println("누적 요금: " + t1.getTotalFee());
    }
}