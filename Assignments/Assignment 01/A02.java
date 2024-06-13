/*
 * Assignment 02
 * 
 * Reorganize the code below so that there will no print statements in the 
 * main method. Instead, main should contain only 4-5 lines of code.
 * 
 */
public class A02 {
    public static void main(String[] args) {
        String[] copyFrom = {
            "3 ripe bananas", "cream butter with sugar", "grease baking pan", "chop 1/2 cup of walnuts", "2 cups all purpose flour", "whisk cream cheese and powder sugar", 
            "preheat over 360F", "2 tablespoons vanilla", "cut bread lengthwide, in half", "add 1 tablespoon of vanilla to frosting and whisk more", "1/2 cup powder sugar",
            "apply frosting on bread", "1/2 cup sugar", "2 eggs in room temperature", "add bananas and eggs with creamed butter", "pour batter to baking pan", "add flour to mix",
            "add baking powder to batter", "let banana bread cool for 30 minutes", "1 pinch of salt", "add layer of frosting on bottom half", "mix bananas and eggs", "add walnuts to the batter",
            "1 cup of cream cheese at room temperature", "1 teaspoon of baking powder", "add 1 tablespoon vanilla to the eggs", "place top half on top of frosting", "bake 1 hour" };

        String[] copyTo = new String[28];
        System.arraycopy(copyFrom, 0, copyTo, 0, 28);
        for (String baking : copyTo) {
            System.out.println(baking + " ");
        }          
    }
}