package carrentalsystem;

   /**
    * Car Class: Represents cars available for rent in the rental system.
    Programmer: Dennis Mwangi 
    * BSE-05-0160/2024
    */
public class CarRental {
    private String carModel;
    private int carYear;
    private double rentalRate;
    private boolean isRented;

    public CarRental(String carMake, String carModel, double rentalRate) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }

    public void rentCar() {
        if (!isRented) {
            System.out.println("Rental successful!");
            isRented = true;
        } else {
            System.out.println("Car is already rented.");
        }
    }

    public void returnCar() {
        if (isRented) {
            System.out.println("Return successful!");
            isRented = false;
        } else {
            System.out.println("Car is not rented.");
        }
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + carMake);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Rate: $" + rentalRate);
        System.out.println("Is Rented: " + isRented);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter rental rate: ");
        double rentalRate = scanner.nextDouble();

        CarRental car = new CarRental(carMake, carModel, rentalRate);

        while (true) {
            System.out.println("\nCar Rental Menu");
            System.out.println("1. Rent Car");
            System.out.println("2. Return Car");
            System.out.println("3. Display Car Info");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car.rentCar();
                    break;
                case 2:
                    car.returnCar();
                    break;
                case 3:
                    car.displayCarInfo();
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }

        scanner.close();
    }
}