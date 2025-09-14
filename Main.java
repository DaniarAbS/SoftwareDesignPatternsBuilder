public class Main {
    public static void main(String[] args) {
        Laptop gamingLaptop = new Laptop.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setSSD(true)
                .setGPU("NVIDIA RTX 4080")
                .setScreenSize(17.3)
                .build();

        Laptop officeLaptop = new Laptop.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setSSD(true)
                .setGPU("Integrated Intel Graphics")
                .setScreenSize(15.6)
                .build();

        System.out.println(gamingLaptop);
        System.out.println(officeLaptop);
    }
}
