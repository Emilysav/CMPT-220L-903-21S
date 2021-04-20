package base;

public class Plant {
    boolean isPlant;
    String Plantfamily;
    String Plantname;
    Integer PlantSize;
    Integer PlantHeightft;

    public Plant(String Plantfamily, String Plantname, Integer PlantSize, Integer PlantHeightft){
        this.isPlant = true;
        this.Plantfamily = Plantfamily;
        this.Plantname = Plantname;
        this.PlantSize = PlantSize;
        this.PlantHeightft = PlantHeightft;
    }

    public void info() {
        System.out.println("this plant is a" + Plantfamily);
        System.out.println("This plants name is" + Plantname);
        System.out.println("This is a" + PlantSize + "plant");
        System.out.println("This plant is" + PlantHeightft + "feet tall");
    }

    public void needswater(){
        if (5 <= PlantHeightft) {
            System.out.println("this place needs to be watered once a day");
        }
        else{
            System.out.println("this plant needs to be watered once every other day");
        }
    }

    public void Needssunlight(){
        if (PlantSize >= 5) {
            System.out.println("This plant needs 6+ hours of sumlight");
        }
        else{
            System.out.println("This plant needs less than 6 hours of sunlight")
        }

    }
}