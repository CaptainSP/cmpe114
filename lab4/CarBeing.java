

public class CarBeing implements Behavior, Comparable {

	private static int count;
	public String name;
	public int year;
	public int speed;

	public CarBeing(String name, int year, int speed) {
		this.name = name;
		this.year = year;
		this.speed = speed;
		count++;
	}

	public String tellName() {
		return name;
	}

	public int tellSpeed() {
		return speed;
	}

	public int tellCarAge() {
		return 2022 - year;
	}

	public static int getCarPopulation() {
		return count;
	}

	@Override
	public String toString() {
		return "Car Name : " + name + ", Car Age : " + tellCarAge() + ", Car Speed : " + speed;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof CarBeing) {
			CarBeing c = (CarBeing) o;
			if (c.tellName().equals(name) && c.year == year) {
				return 10;
			} else if (!c.tellName().equals(name) && c.speed == speed) {
				return 0;
			} else if (!c.tellName().equals(name) && speed < c.speed) {
				return -1;
			} else if (!c.tellName().equals(name) && speed > c.speed) {
				return 1;
			}
		}
		return -10;
	}

	public String compareCar(CarBeing o) {
		int c = compareTo(o);
		if (c == 10) {
			return (name + " and " + o.name + " are same cars");
		} else if (c == 0) {
			return (name + "'s speed is equal to " + o.name);
		} else if (c == -1) {
			return (name + "'s speed is smaller than " + o.name);
		} else if (c == 1) {
			return (name + "'s speed is greater than " + o.name);
		} else {
			return ("This is not I wanted");
		}
	}

}
