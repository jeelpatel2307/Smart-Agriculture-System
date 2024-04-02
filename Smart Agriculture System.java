import java.util.ArrayList;
import java.util.List;

// Class to represent a Farm
class Farm {
    private String farmName;
    private List<Crop> crops;

    public Farm(String farmName) {
        this.farmName = farmName;
        this.crops = new ArrayList<>();
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }
}

// Class to represent a Crop
class Crop {
    private String cropName;
    private double temperature;
    private double humidity;
    private double soilMoisture;

    public Crop(String cropName) {
        this.cropName = cropName;
    }

    public void updateEnvironment(double temperature, double humidity, double soilMoisture) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.soilMoisture = soilMoisture;
        System.out.println("Environment updated for " + cropName + ": Temp=" + temperature + ", Humidity=" + humidity + ", Soil Moisture=" + soilMoisture);
    }
}

// Main class
public class SmartAgricultureSystem {
    public static void main(String[] args) {
        // Create a farm
        Farm farm = new Farm("Smart Farm");

        // Add crops to the farm
        Crop wheat = new Crop("Wheat");
        Crop rice = new Crop("Rice");

        farm.addCrop(wheat);
        farm.addCrop(rice);

        // Simulate environmental data updates
        simulateEnvironmentUpdates(farm);
    }

    // Simulate environmental data updates
    private static void simulateEnvironmentUpdates(Farm farm) {
        // Simulate temperature, humidity, and soil moisture updates for each crop
        for (Crop crop : farm.getCrops()) {
            double temperature = Math.random() * 40; // Random temperature between 0 to 40 degrees Celsius
            double humidity = Math.random() * 100; // Random humidity between 0 to 100 percent
            double soilMoisture = Math.random() * 100; // Random soil moisture between 0 to 100 percent

            // Update environment for the crop
            crop.updateEnvironment(temperature, humidity, soilMoisture);
        }
    }
}
