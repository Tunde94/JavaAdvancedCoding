package ro.sda.advanced._3_composition;

/*

 * The following exercise is for understanding composition, we will create a few classes which represents different
 * components of a PC.

 * Create a class named Dimensions with the following instance variables: width, height, depth
 * The class should contain getters for all the fields.

 * Create a class Case containing the following instance variables: model, manufacturer and powerSupply (all strings)
 * and dimensions which is of type Dimension

 * The class should have:
 * - a constructor with parameters
 * - getters for all the fields
 * - a method pressPowerButton() - which will only print "Power button pressed"

 * Create a class resolution which will have only 2 fields: width and height (both are int)

 * The class should have:
 * - a constructor
 * - getters for both fields

 *  Create a class Monitor which will have the following fields: model, manufacturer, size (all are String)
 *  and a field nativeResolution which is of type Resolution

 * The class should have:
 * - a constructor
 * - getters for all the fields
 * - a method named drawPixelAt(int x, int y, String color) which will only print "Drawing pixel at ... in color ..."

 *  Create a class Motherboard with the following fields: model, manufacturer, bios (all are String),
 *  ramSlots and cardSlots (both are int)

 *  The class should have:
 *  - a constructor
 *  - getters for all the fields
 *  - a method loadProgram(programName) which will print a message when a program is loaded
 *  Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard

 *  The class should have:
 *  - a constructor
 *  - a method powerUp() - which will call the method for powering up from the Case class
 *  - a method drawLogo() - which will call the method drawPixel from Monitor class
 */
//prop OOP: inheritance, polymorphism, abstraction, encapsulation
//composition  nu este proprietate OOP
public class Main {
    public static void main(String[] args) {
        Case case1 = new Case("220b", "HP", "230", new Dimensions(20, 30, 50));

        Monitor monitor1 = new Monitor("27 inch", "Asus", "27", new Resolution(20, 30));
        Motherboard motherboard = new Motherboard("Hp Laptop", "Hp", "f.58", 128, 1228);
        PC pc1 = new PC(case1, monitor1, motherboard);
        pc1.powerUp();

        case1.setManufacturer("Gigabyte");
        case1.setModel("nush d-astea");



        /*PC pc2 = new PC(
                new Case("m1", "Dell", "230",
                        new Dimensions(20, 120, 90)),
                new Monitor("Asus 510", "Asus", "80",
                        new Resolution(28, 30)),
                new Motherboard("model", "manufacture", "5", 64, 128));

        pc2.powerUp();*/
    }
}
