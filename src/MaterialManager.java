import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    public static void main(String[] args) {
        List<Material> materials = new ArrayList<>();
        Meat thit1 = new Meat("01", "Thịt 1", LocalDate.of(2021, 1, 14), 100, 1);
        Meat thit2 = new Meat("02", "Thịt 2", LocalDate.of(2021, 1, 13), 100, 1);
        Meat thit3 = new Meat("03", "Thịt 3", LocalDate.of(2021, 1, 12), 100, 1);
        Meat thit4 = new Meat("04", "Thịt 4", LocalDate.of(2021, 1, 11), 100, 1);
        Meat thit5 = new Meat("05", "Thịt 5", LocalDate.of(2021, 1, 10), 100, 1);
        materials.add(thit1);
        materials.add(thit2);
        materials.add(thit3);
        materials.add(thit4);
        materials.add(thit5);
        CrispyFlour bot1 = new CrispyFlour("b1", "Bột 1", LocalDate.of(2020, 3,14 ), 10, 1);
        CrispyFlour bot2 = new CrispyFlour("b1", "Bột 1", LocalDate.of(2020, 3,14 ), 10, 1);
        CrispyFlour bot3 = new CrispyFlour("b1", "Bột 1", LocalDate.of(2020, 3,14 ), 10, 1);
        CrispyFlour bot4 = new CrispyFlour("b1", "Bột 1", LocalDate.of(2020, 3,14 ), 10, 1);
        CrispyFlour bot5 = new CrispyFlour("b1", "Bột 1", LocalDate.of(2020, 3,14 ), 10, 1);
        materials.add(bot1);
        materials.add(bot2);
        materials.add(bot3);
        materials.add(bot4);
        materials.add(bot5);
        double tonggiagoc = 0;
        double tonggiasaugiam = 0;
        for (Material a:materials
             ) {
            tonggiagoc += a.getAmount();
//            tonggiasaugiam += a.getRealMoney();
        }
        double chenhlech = tonggiagoc - tonggiasaugiam;
        System.out.println(chenhlech);

    }
}