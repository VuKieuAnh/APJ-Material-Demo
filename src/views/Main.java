package views;

import manager.MaterialManager;
import model.Material;
import model.Meat;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Material> materials = MaterialManager.materials;
    public static void main(String[] args) {
        editMeatById();
    }

    private static void editMeatById() {
        // phuong thuc sua
//        nhap id vao
        String id = "0";
//        nhap cac thong tin khac de sua
        Material m = new Meat();
//      nhap ten
//        nhap nam het han

        MaterialManager.updateById(id, m);
    }
}
