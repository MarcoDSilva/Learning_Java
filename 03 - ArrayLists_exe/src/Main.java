/*
 * MIT - Open License
 */

/**
 * Exercicio ArrayLists
 *
 * @author MSilva
 */
public class Main {

    public static void main(String args[]) {
        Lists stringHolder = new Lists(10);

        /**
         * TESTES ADD
         */
        stringHolder.addSentence("a");
        stringHolder.addSentence("bb");
        stringHolder.addSentence(" cc");
        stringHolder.addSentence("dddd");
        stringHolder.addSentence("eeeee");
        stringHolder.addSentence("3fffff");
        stringHolder.addSentence("ggggggg");
        stringHolder.addSentence("hhhhhhhh");
        stringHolder.addSentence("iiiiiiiii");
        stringHolder.addSentence("ajjjjjjjjj");

        //returns the actual arraylist content
        System.out.println("actual content.");
        System.out.println(stringHolder.toString());

        //biggest and smallest strings
        System.out.println("biggest string : " + stringHolder.biggestSentence());
        System.out.println("smallest string : " + stringHolder.smallestSentence());

        //ordering the arraylist from biggest to smallest
        stringHolder.sortList();
        System.out.println("ArrayList in order from biggest to smallest");
        System.out.println(stringHolder.toString());
        
        
    }

}
