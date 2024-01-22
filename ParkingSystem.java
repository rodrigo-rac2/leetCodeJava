// problem: https://leetcode.com/problems/design-parking-system/

class ParkingSystem {
    private int big = 0;
    private int medium = 0;
    private int small = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean returnValue = false;
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    returnValue = true;
                }
                break;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    returnValue = true;
                }
                break;
            case 3:
                if (this.small > 0) {
                    this.small--;
                    returnValue = true;
                }
                break;
            default:
                returnValue = false;

        }
        return returnValue;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
