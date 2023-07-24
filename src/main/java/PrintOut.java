public class PrintOut {

    public String printOptions(Node node) {
        return "Do you wish to:\n" +
               "1 - " + node.getForwardOptions()[0] + "\n" +
                "2 - " + node.getForwardOptions()[1] + "\n";}

    public void typeText(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(0);
            }
            System.out.println(); // Move to the next line after typing is finished
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}