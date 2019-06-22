/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.MenuEnum;
import dto.MenuDto;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.ColorUtils;
import view.pnClass;
import view.pnCourse;
import view.pnHomePage;
import view.pnStatistic;
import view.pnStudent;

/**
 *
 * @author hbui
 */
public class Navigator {

    private JPanel pnMainView;
    private List<MenuDto> menus;
    private JPanel curPanel;

    public Navigator(JPanel pnMainView, List<MenuDto> menus) {
        this.pnMainView = pnMainView;
        this.menus = menus;
    }

    public void setStartPage(JPanel pnHomePage) {
        this.pnMainView.setLayout(new BorderLayout());
        this.pnMainView.add(pnHomePage);
    }

    public void setEvents() {
        menus.forEach(menu -> menu.getLabel().addMouseListener(new LabelMenuListener(menu)));
    }

    class LabelMenuListener extends MouseAdapter {

        private MenuEnum name;
        private JPanel panel;
        private JLabel label;

        public LabelMenuListener() {
        }

        private LabelMenuListener(MenuDto menu) {
            this.name = menu.getName();
            this.panel = menu.getPanel();
            this.label = menu.getLabel();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            for (MenuDto menu : menus) {
                menu.getPanel().setBackground(ColorUtils.NORMAL_COLOR);
            }
            this.panel.setBackground(ColorUtils.HOVER_COLOR);
            curPanel = this.panel;

            // set page for each menu tab
            pnMainView.removeAll();
            pnMainView.setLayout(new BorderLayout());
            switch (name) {
                case HOMEPAGE:
                    pnMainView.add(new pnHomePage());
                    break;
                case STUDENT:
                    pnMainView.add(new pnStudent());
                    break;
                case CLASS:
                    pnMainView.add(new pnClass(), BorderLayout.CENTER);
                    break;
                case COURSE:
                    pnMainView.add(new pnCourse(), BorderLayout.CENTER);
                    break;
                case STATISTIC:
                    pnMainView.add(new pnStatistic());
                    break;
            }
            pnMainView.validate();
            pnMainView.repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            this.panel.setBackground(ColorUtils.HOVER_COLOR);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (curPanel != this.panel) {
                this.panel.setBackground(ColorUtils.NORMAL_COLOR);
            }
        }

    }

}
