package builderpatterm.builder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer= new Computer.Builder()
                .addCPU(("Core i12 18000"))
                .addRam("Ram 160GB")
                .addScreen("17 incl")
                .build();
        System.out.println(computer.toString());
    }
}
