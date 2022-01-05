package org.example.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component{

    // Composition attribute
    private List<Component> components = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    public void addComponent(Component component){
        component.setParentNode(this);
        this.components.add(component);
    }

    public void deleteComponent(Component component){
        this.components.remove(component);
    }

    public void deleteCategory() throws Exception {
        if(this.getParentNode() == null) throw new Exception("Cannot delete Root Node");
        this.getParentNode().deleteComponent(this);
    }


    public void view() {
        view(0);
    }

    @Override
    public void view(int count) {
        System.out.println(this.getName());
        count++;
        for(Component component : this.components){
            for(int i = 0; i < count; i++)
                System.out.print("\t");
            component.view(count);
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
