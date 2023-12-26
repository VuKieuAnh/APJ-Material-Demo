package manager;

import model.Material;

import java.util.ArrayList;
import java.util.LinkedList;

public class MaterialManager {
    public static ArrayList<Material> materials = new ArrayList();
//    create
    public static void addNewMaterial(Material material){
        materials.add(material);
    }
//  read
    public static ArrayList<Material> getMaterials(){
        return materials;
    }
//    update
    public static void updateMaterial(int index, Material material){
        materials.set(index, material);
    }

    public static void updateById(String id, Material newM){
        for (Material material: materials){
            if (material.getId() == id){
//                thuc hien sua
                material = newM;
            }
        }
    }
}
