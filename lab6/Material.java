public class Material {
    private double numberOfPages;
    private double pagePrice;

    public double getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(double numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPagePrice() {
        return pagePrice;
    }

    public void setPagePrice(double pagePrice) {
        this.pagePrice = pagePrice;
    }

    public void printPrice(double price) {
        System.out.println(this.getClass().getSimpleName() + " price is: " + price);
    }

    public double getPrintingPrice() {
        System.out.println(this.getClass().getSimpleName() + " getPrintingPrice method is invoked");
        return numberOfPages * pagePrice;
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName() + " print method is invoked");
        System.out.println("This method prints material of class " + this.getClass().getSimpleName());
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.getClass().getSimpleName() + " equals method is invoked");
        if (obj == null) {
            return false;
        }
        return (obj.getClass() == getClass()) && ((Material) obj).numberOfPages == numberOfPages;

    }

    @Override
    public String toString() {
        return  numberOfPages + "   " + pagePrice;
    }
}
