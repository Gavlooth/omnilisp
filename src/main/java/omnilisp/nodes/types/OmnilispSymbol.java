 package Omnilisp.types;

public class OmnilispSymbol {
    public final String name;

    public OmnilispSymbol(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
