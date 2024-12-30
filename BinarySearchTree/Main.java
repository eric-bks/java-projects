public class Main
{
    public static void main(String[] args) {
        //Node node = new Node("Chad");
        BST tree = new BST();

        tree.Insert("Chad");
        tree.Insert("Harry"); //9
        tree.Insert("Gyula");
        tree.Insert("Garry");//19
        tree.Insert("Susan");//24
        tree.Insert("Whitney");//31
        tree.Insert("Flavia");//37
        tree.Insert("Hazel");//42
        tree.Insert("Sage");//46


        //tree.InOrder();

        //tree.Clear();
        //tree.InOrder();
        System.out.println(tree.Search2("Alex"));//false
        System.out.println(tree.Search2("Hazel"));//true

        System.out.println(tree.CountLeafNodes()); //3
        System.out.println(tree.CountNodes()); //9
        System.out.println(tree.FindHeight()); //4
        System.out.println(tree.NumberOfAllLetters());//46

    }
}