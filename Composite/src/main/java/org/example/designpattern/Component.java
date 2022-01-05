package org.example.designpattern;

public abstract class Component {

    // A component Attribute to know the Direct Parent of The current Componnent
    private Category parentNode;
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentNode() {
        return parentNode;
    }

    public void setParentNode(Category parentNode) {
        this.parentNode = parentNode;
    }

    protected abstract void view(int count);
    public abstract void view();
}
