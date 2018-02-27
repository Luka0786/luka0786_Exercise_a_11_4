package Kap11Exercise4;

import java.util.LinkedList;
import java.util.List;

public class Opgave4
{
    /*
    Write a method called partition that accepts a list of integers and
    an integer value E as its parameter, and rearranges (partitions) the
    list so that all the elements with values less than E occur before all
    elements with values greater than E. The exact order of the elements is unimportant,
    so long as all elements less than E appear before all elements greater than E.

     For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9], one acceptable ordering of
     the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].


    */

    public static void main(String[] args) {

      // List<Integer> exerciseFour = createList(20, 50);


        List<Integer> exerciseFour = new LinkedList<>();
        exerciseFour.add(0, -2);
        exerciseFour.add(1, 3);
        exerciseFour.add(2, -77);
        exerciseFour.add(3, -16);
        exerciseFour.add(4, 0);
        exerciseFour.add(5, 13);
        exerciseFour.add(6, 29);
        exerciseFour.add(7, 9);
        exerciseFour.add(8, 77);
        exerciseFour.add(9, 13);
        exerciseFour.add(10, 5);
        exerciseFour.add(11, 10);
        exerciseFour.add(12, -8);

        System.out.println(partition(exerciseFour, 9));


    }

    private static List<Integer> partition(List<Integer> list, Integer E)
    {
        for (int i = 0; i < list.size() ; i++)
        {
            if (E > list.get(i))
            {
                int getTheNumber = list.get(i);
                list.remove(i);
                list.add(0, getTheNumber);
            }
        }
        return list;
    }





/*
    private static List<Integer> partition(List<Integer> list, Integer e)
    {
        Iterator<Integer> iterator1 = list.iterator();
        List<Integer> returningList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            while(iterator1.hasNext())
            {
                if (list.get(i) < e || iterator1.hasNext() )
                {
                    returningList.add(iterator1.next());
                }

                if (list.get(i) > e || iterator1.hasNext() )
                {
                    returningList.add(iterator1.next());
                }
            }
        }
    return returningList;
    }
    */





}
