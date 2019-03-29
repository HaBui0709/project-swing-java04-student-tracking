/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.MenuDto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.pnHomePage;

/**
 *
 * @author KimAnh
 */
public class Navigator {

    private JPanel pnMainView;
    public Navigator(JPanel pnMainView) {
        this.pnMainView = pnMainView;
    }


    public void setStartPage(JPanel pnHomePage) {
        this.pnMainView.add(pnHomePage);
    }

    public void setEvents(List<MenuDto> menus) {
        menus.forEach(menu -> menu.getLabel().addMouseListener(new LabelMenuListener(menu)));
    }
    
    class LabelMenuListener extends MouseAdapter{

        private JPanel panel;
        private JLabel label;
        public LabelMenuListener() {
        }

        private LabelMenuListener(MenuDto menu) {
            this.panel = menu.getPanel();
            this.label = menu.getLabel();
        }

        
        @Override
        public void mousePressed(MouseEvent e) {
            
        }
        
    }
    
}
