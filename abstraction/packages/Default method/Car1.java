public class Car1 implements Vehicle, FourWheeler {

    @Override
    public void message() {

        // Calling Vehicle interface default method
        Vehicle.super.message();
    }
}