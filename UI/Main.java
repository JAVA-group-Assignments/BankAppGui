package UI;

import UI.WithdrawUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double initialBalance = 100000.00;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WithdrawUI(initialBalance);
            }
        });
    }
}
