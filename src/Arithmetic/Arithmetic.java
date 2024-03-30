package Arithmetic;
public class Arithmetic<T extends Number, U extends Number> {
    private final T num1;
    private final U num2;
    public Arithmetic(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide(){
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin(){
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public Number getMax(){
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}