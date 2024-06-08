package Controller;

public class MaterialManager {
    private List<Material> materials;
    private static final String FILE_NAME = "materials.dat";

    public MaterialController() {
        materials = new ArrayList<>();
        loadMaterials();
    }

}
