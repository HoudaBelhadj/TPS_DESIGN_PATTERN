package org.example.designpattern;

public class Product extends Component{


    public Product(String name) {
        super(name);
    }

    @Override
    public void view(int count) {
        System.out.println(this.getName());
    }

    @Override
    public void view() {
        System.out.println(this.getName());
    }
}
