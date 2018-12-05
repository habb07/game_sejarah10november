/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Habibullah
 */
public class m_Player extends Rectangle {
    //movement booleans
    private boolean right = false, left = false, jumping = false, falling = false;
    private boolean topCollision = false;
    
    //bounds
    private double x,y;
    private int width, height;
    
    //move speed
    private double moveSpeed = 2.5;
    
    //jump speed
    private double jumpSpeed = 5;
    private double currentJumpSpeed = jumpSpeed;
    
    //fall speed
    private double maxFallSpeed = 5;
    private double currentFallSpeed = 0.1;
    
    public m_Player(int width, int height) {
        x = 200;
        y = 200;
        this.width = width;
        this.height = height;
        
    }
    
    public void tick() {
        
        int iX = (int)x;
        int iY = (int)y;
        
        if (right) {
            x += moveSpeed;
        }
        
        if (left) {
            x -= moveSpeed;
        }
        
        if (jumping) {
            y -= currentJumpSpeed;
            
            currentJumpSpeed -= .1;
            
            if (currentJumpSpeed <= 0) {
                currentJumpSpeed = jumpSpeed;
                jumping = false;
                falling = true;
            }
        }
        
        if (falling) {
            y += currentFallSpeed;
            
            if (currentFallSpeed < maxFallSpeed) {
                currentFallSpeed += .1;
            }
        }
        
        if (!falling) {
            currentFallSpeed = .1;
        }
    }
    
    public void keyPressed(int k) {
        if (k == KeyEvent.VK_D) right = true;
        if (k == KeyEvent.VK_A) left = true;
        if (k == KeyEvent.VK_SPACE && !jumping && !falling) jumping = true;
        
    }

    public void keyReleased(int k) {
        if (k == KeyEvent.VK_D) right = false;
        if (k == KeyEvent.VK_A) left = false;
        
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect((int)x, (int)y, width, height);
    }
}
