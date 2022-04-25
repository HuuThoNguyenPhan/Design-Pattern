package builderpatterm.baitap2;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder(Builder builder){
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str;
    }

    public static class Builder{
        String str;
        Builder addStr(String str){
            this.str = str;
            return this;
        }

        Builder addString(String s){
            this.str = this.str + s;
            return this;
        }

        Builder addFloat(float f){
            this.str = this.str + f;
            return this;
        }

        Builder addBool(boolean b){
            this.str = this.str + b;
            return this;
        }

        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
