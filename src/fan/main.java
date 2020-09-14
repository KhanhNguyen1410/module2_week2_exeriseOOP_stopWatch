package fan;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.getFAST();
        fan1.setOn(true);
        fan1.setRADIUS(10);
        fan1.setCOLOR("yellow");
        Fan fan2 = new Fan();
        fan2.getMEDIUM();
        fan2.setCOLOR("blue");
        fan2.setRADIUS(5);
        fan2.setOn(false);
        if (fan1.on){
            System.out.println("fan1 "+fan1.toString() + " fan is on");
        }
        if (!fan2.on){
            System.out.println("fan2 "+fan2.toString() + " fan is off");
        }
    }
}
