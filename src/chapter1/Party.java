package chapter1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Party at Tim`s");

        Button b = new Button("You bet");
        Button c = new Button("Shoot me");

        Panel p = new Panel();

        p.add(l);
    }
}
