package aula;

import robocode.*;
import java.awt.Color;

// Herança
public class BrN0 extends Robot {

    // Polimorfismo
    public void run() {
        setColors(Color.RED, Color.WHITE, Color.WHITE); 

        while (true) {
            ahead(100); 
            turnGunRight(360); 
            back(100); 
            turnGunRight(360); 
        }
    }

    // Polimorfismo
    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance(); 
        if (distance < 150) {
            fire(3); 
        } else if (distance < 500) {
            fire(2); 
        } else {
            fire(1); 
        }
    }

    public void onHitByBullet(HitByBulletEvent e) {
        turnRight(90); 
        ahead(100); 
    }

    public void onHitWall(HitWallEvent e) {
        back(50);
        turnRight(90); 
    }
}
