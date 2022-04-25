package builderpatterm.builder;

public class Computer {
    String CPU,Ram,Screen;

    public Computer(Builder builder) {
        this.CPU=builder.CPU;
        this.Ram=builder.Ram;
        this.Screen=builder.Screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", Ram='" + Ram + '\'' +
                ", Screen='" + Screen + '\'' +
                '}';
    }

    public static class Builder{
        String CPU,Ram,Screen;

        Builder addRam(String Ram){
            this.Ram =Ram;
            return this;
        }
        Builder addScreen(String Screen){
            this.Screen=Screen;
            return this;
        }
        Builder addCPU(String CPU){
            this.CPU=CPU;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
