package test_project;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Whatsapp {
    // Function to simulate typing a string
    private static void typeString(Robot robot, String text) throws InterruptedException {
        for (char ch : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                throw new RuntimeException("Key code not found for character '" + ch + "'");
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(100); // Small delay between key presses
        }
    }

    // Function to simulate key press
    private static void pressKey(Robot robot, int keyCode) throws InterruptedException {
        robot.keyPress(keyCode);
        Thread.sleep(100);
        robot.keyRelease(keyCode);
    }

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            // Step 1: Minimize all windows to go to the desktop
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(1000);

            // Step 2: Open the Start menu
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(2000);

            // Step 3: Search for WhatsApp
            typeString(robot, "WhatsApp");
            pressKey(robot, KeyEvent.VK_ENTER);
            Thread.sleep(3000);

            // Step 4: Search for the contact
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_F);
            robot.keyRelease(KeyEvent.VK_F);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);

            typeString(robot, "Mummy"); // Replace with the contact name
            Thread.sleep(2000);

            // Step 5: Navigate to the chat
            pressKey(robot, KeyEvent.VK_DOWN);
            Thread.sleep(2000);
            pressKey(robot, KeyEvent.VK_ENTER);
            Thread.sleep(2000);

            // Step 6: Write and send the message
            typeString(robot, "ye msg jo tu padh rhi h mene iska code likha h python me bina ws khole kuch kre ye msg tere pass code se aa rha h mene code likh kr python aur ws ko jod mara");
            pressKey(robot, KeyEvent.VK_ENTER);

            // Step 7: Print message sent confirmation
            System.out.println("Message sent successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
