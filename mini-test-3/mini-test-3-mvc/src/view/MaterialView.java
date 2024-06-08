package view;
import models.Material;

public class MaterialView {
    public void displayMaterials(List<Material> materials) {
        for (Material material : materials) {
            System.out.println(material.getName() + " - Real Money: " + ((Discount) material).getRealMoney());
        }
    }
}
