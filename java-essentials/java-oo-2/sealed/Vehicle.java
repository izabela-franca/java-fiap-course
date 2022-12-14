package sealed;
                //before class
public abstract sealed class Vehicle permits Car, Bus {

    public abstract void drive();

    //Classes which implement or belong to a sealed class need a modifier (final,non-sealed or sealed)
}
