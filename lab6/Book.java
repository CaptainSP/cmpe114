public class Book extends Material {
    private double startingPrice = 10;

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    @Override
    public double getPrintingPrice() {
        return super.getPrintingPrice() + startingPrice;
    }


    public void print(double val) {
        System.out.println(this.getClass().getSimpleName() + " print method is invoked");
        System.out.println("This method is overloaded with an double parameter the value is: " + val);

    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.getClass().getSimpleName() + " equals method is invoked");
        if (obj == null) {
            return false;
        }
        return (obj.getClass() == getClass()) && ((Material) obj).getNumberOfPages() == getNumberOfPages() && ((Book) obj).getStartingPrice() == getStartingPrice();

    }



    @Override
    public String toString() {
        return getNumberOfPages() + "  " + getPagePrice() + "  " + startingPrice;
    }
}
