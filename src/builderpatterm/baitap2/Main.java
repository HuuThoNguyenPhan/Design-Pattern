package builderpatterm.baitap2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder m = new MyStringBuilder.Builder()
                .addStr("Thọ")
                .addString("được")
                .addFloat(9.5f)
                .addBool(true)
                .build();
        System.out.println(m);
    }
}
