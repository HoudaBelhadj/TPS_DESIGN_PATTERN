package org.example;

import org.example.designpattern.Category;
import org.example.designpattern.Component;
import org.example.designpattern.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Category category1 = new Category("category1");
        Category category11 = new Category("category11");
        Category category12 = new Category("category12");
        Product product13 = new Product("product13");

        Category category121 = new Category("category121");
        Product product1211 = new Product("product1211");


        category1.addComponent(category11);
        category1.addComponent(category12);
        category1.addComponent(product13);

        category12.addComponent(category121);
        category121.addComponent(product1211);

        // Show the View before Delete
        category1.view();
        // Delete Category12
        category12.deleteCategory();
        // Show the View after Delete
        category1.view();
    }
}
