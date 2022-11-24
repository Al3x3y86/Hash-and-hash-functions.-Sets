import Products.Fruits;
import Products.Product;
import Products.Vegetables;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Vegetables potato = new Vegetables("Картофель", 5, 50.00);
        Vegetables carrot = new Vegetables("Морковь", 3, 30.00);
        Vegetables onion = new Vegetables("Лук", 4, 30.00);
        Fruits oranges = new Fruits("Апельсины", 2, 30.00);
        Fruits apples = new Fruits("Яблоки", 3, 30.00);
        Fruits bananas = new Fruits("Бананы", 1, 30.00);
        Fruits lemon = new Fruits("Лимон", 1, 30.00);

        List < Product> products = new ArrayList<>();
        products.add(potato);
        products.add(carrot);
        products.add(onion);
        products.add(oranges);
        products.add(apples);
        products.add(bananas);
        products.add(lemon);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        products.remove(lemon);
        System.out.println(products.contains(potato));
        System.out.println(products.contains(lemon));


        Set<String> product = new HashSet<>();
        product.add(potato.getName());
        product.add(potato.getName());
        product.add(carrot.getName());
        product.add(onion.getName());
        product.add(oranges.getName());
        product.add(oranges.getName());
        product.add(apples.getName());
        product.add(bananas.getName());
        product.add(lemon.getName());

        System.out.println(Arrays.toString(product.toArray()));


        List<Recipes> cookBook = new ArrayList<>();
        cookBook.add(new Recipes("Жарка", "Картофель, Морковь, Лук",300));
        cookBook.add(new Recipes("Компот", "Яблоки, Апельсины, Лимон",400));
        cookBook.add(new Recipes("Салат", "Картофель, Морковь, Лук, Яблоки",500));
        for (int i = 0; i < cookBook.size(); i++) {
            System.out.println(cookBook.get(i));
        }


        System.out.println("ДЗ 2, Задание 2");
        ArrayList<Integer> nums = new ArrayList<>();
        decide(nums);

        System.out.println("Таблицы умножения");
        List<Pair> allPairs = new ArrayList<>();
        for (int first = 2; first <= 9; first++)
        {
            for (int second = first; second <= 9; second++)
            {
                allPairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<Pair> chosenPairs = allPairs.subList(0, 15);
        System.out.println(chosenPairs);

        System.out.println("Паспорт");
        HashMap<Integer, String> passportID = new HashMap <>();
        passportID.put( 112233, "Иванов Иван Иванович 10.10.2000");
        passportID.put( 112244, "Иванов Александр Александрович 11.10.2000");
        passportID.put( 112255, "Иванов Сергей Сергеевич 12.10.2000");
        passportID.put( 112266, "Иванов Алексей Алексеевич 13.10.2000");
        passportID.put( 112233, "Иванов Петр Петрович 14.10.2000");

        String IvanovII = passportID.get(112233);
        System.out.println(IvanovII);

        System.out.println(passportID.containsKey(112277));





    }

    public static void decide (ArrayList<Integer> list){
        for(int i = 0;i<20;i++) {
            list.add((int)(Math.random()*1000));
        }
        System.out.println(list.toString());
        for(int i = 0;i<list.size();i++) {
            if(list.get(i) % 2 != 0)list.remove(i);
        }
        System.out.println(list);

    }


    }







