package base;

public class Plant {
    boolean isPlant;
    String Plantfamily;
    String Plantname;
    boolean needssunlight;
    Integer Plantsize

    public Plant(boolean isPlant, String Plantfamily, String Plantname, boolean needssunlight, Integer PlantHeightft){
    }

    public void info() {
        System.out.println("this plant is a" + Plantfamily);
        System.out.println("This plants name is" + Plantname);
        System.out.println("This plant is" + Plantsize + "feet tall");
    }

    public void sunlightrequirements(){
        if (needssunlight = true) {
            System.out.println("this plant needs the sun to grow!");
        }
        else{
            System.out.println("this plan does not need a lot of sunlight to grow");
        }
    }

    public void wateringinstructions(){
        if (Plantsize >= 5) {
            System.out.println("water generously");
        }
        else{
            System.out.println("water cautiously");
        }

    }
}