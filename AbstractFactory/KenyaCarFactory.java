class KenyaCarFactory {

    static Car buildCar(CarType model) {

        Car car = null;
        switch(model) {
            case MICRO:
                car = new MicroCar(Location.KENYA);
                break;
            case MINI:
                car = new MiniCar(Location.KENYA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.KENYA);
                break;
            default:
                break;
        }

        return car;
    }
}
