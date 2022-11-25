

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBeing mercedes = new CarBeing("Mercedes", 2006, 230);
		System.out.println(mercedes);
		CarBeing bmw = new CarBeing("BMW", 2016, 250);
		System.out.println(bmw);
		CarBeing nissan = new CarBeing("Nissan", 2014, 200);
		System.out.println(nissan);
		CarBeing opel = new CarBeing("Opel", 2011, 220);
		System.out.println(opel);
		CarBeing honda = new CarBeing("Nissan", 2014, 200);
		System.out.println(honda);
		System.out.println();
		System.out.println(mercedes.compareCar(bmw));
		System.out.println(bmw.compareCar(opel));
		System.out.println(nissan.compareCar(honda));
		System.out.println(nissan.compareCar(opel));
		System.out.println();
		System.out.println("Car Population : " + CarBeing.getCarPopulation());
	}

}
