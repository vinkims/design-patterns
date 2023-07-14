class CarFactory {
    
    private CarFactory() {}

    public static Car buildCar(CarType type) {

        Car car = null;

        Location location = Location.KENYA;

        switch(location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case KENYA:
                car = KenyaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }

        return car;
    }
}
