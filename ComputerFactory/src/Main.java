public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,
                "2540 x 1440");

        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4, 6,
                "V2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherBoard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
