public class Laptop {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean hasSSD;
    private final String gpu;
    private final double screenSize;

    // Приватный конструктор – только через Builder
    private Laptop(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasSSD = builder.hasSSD;
        this.gpu = builder.gpu;
        this.screenSize = builder.screenSize;
    }

    @Override
    public String toString() {
        return "Laptop " +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", SSD=" + hasSSD +
                ", GPU='" + gpu + '\'' +
                ", Screen=" + screenSize + " inch";
    }

    // Builder (вложенный static класс)
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean hasSSD;
        private String gpu;
        private double screenSize;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
