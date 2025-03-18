
public class GetValues {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;
    String stringValue;

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public static void main(String[] args) {
        GetValues g = new GetValues();
        byte b=10;
        g.setByteValue(b);
        byte res_byte =g.getByteValue();
        System.out.println("Byte Value : " + res_byte);


        short s = 10;
        g.setShortValue(s);
        short res_short =g.getShortValue();
        System.out.println("Short value : "+res_short);

        int i=10;
        g.setIntValue(i);
        int res_int = g.getIntValue();
        System.out.println("int value : " + res_int);

        long l= 1912378;
        g.setLongValue(l);
        long res_long = g.getLongValue();
        System.out.println(res_long);

        float f= 10.32f;
        g.setFloatValue(f);
        float res_float = g.getFloatValue();
        System.out.println(res_float);

        double d = 12.21312;
        g.setDoubleValue(d);
        double res_double = g.getDoubleValue();
        System.out.println("Double value : " + res_double);

        char c=100;
        g.setCharValue(c);
        char res_char = g.getCharValue();
        System.out.println("char value : " + res_char);

        boolean bl = true;
        g.setBooleanValue(bl);
        boolean res_bool= g.getBooleanValue();
        System.out.println(" Boolean value : "+ res_bool);

        String st = "java is awesome";
        g.setStringValue(st);
        String res_str = g.getStringValue();
        System.out.println("String value : " + res_str);
        
    }
}
