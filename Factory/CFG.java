// Driver program
public class CFG {
    
    public static void main(String[] args) {
        Client client = new Client();
        client.BuildVehicle(VehicleType.VT_TwoWheeler);
        client.getVehicle().printVehicleInfo();

        client.BuildVehicle(VehicleType.VT_ThreeWheeler);
        client.getVehicle().printVehicleInfo();

        client.BuildVehicle(VehicleType.VT_FourWheeler);
        client.getVehicle().printVehicleInfo();
    }
}
