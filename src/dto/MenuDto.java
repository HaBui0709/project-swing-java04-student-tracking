/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import common.MenuEnum;
import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KimAnh
 */
public class MenuDto {
    private MenuEnum name;
    private JPanel panel;
    private JLabel label;

    public MenuDto() {
    }

    public MenuDto(MenuEnum name, JPanel panel, JLabel label) {
        this.name = name;
        this.panel = panel;
        this.label = label;
    }

    public MenuEnum getName() {
        return name;
    }

    public void setName(MenuEnum name) {
        this.name = name;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || !(obj instanceof MenuDto)){
            return false;
        }
        MenuDto dto = (MenuDto) obj;
        return Objects.equals(dto.name, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "MenuDto{" + "name=" + name + ", panel=" + panel + ", label=" + label + '}';
    }

    

    
    
    
    
}
