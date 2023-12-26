import model.*;

public class Main {
    public static void main(String[] args) {
//        Interface: instanceOf va ep kieu
//        ep kieu voi Lop
        Material material[] = new Material[3];
        material[0] = new Meat();
        material[1] = new CrispyFlour();
        material[2] = new Muoi();
        for (int i = 0; i < material.length; i++) {

            if (material[i] instanceof Discount){
                Discount d = (Discount) material[i];
                d.getRealMoney();
            }
        }
    }
}
