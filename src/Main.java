import Products.Product;
import Products.ProductService;
import Products.Recipes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Картофель", 50);
        Product carrot = new Product("Морковь", 30);
        Product onion = new Product("Лук", 30);
        Product oranges = new Product("Апельсины", 30);
        Product apples = new Product("Яблоки", 30);
        Product bananas = new Product("Бананы", 30);
        Product lemon = new Product("Лимон",  30);

        ProductService productService = new ProductService();
        productService.add(potato);
        productService.add(carrot);
        productService.add(onion);
        productService.add(oranges);
        productService.add(apples);
        productService.add(bananas);
        productService.add(lemon);

        System.out.println(productService);

        System.out.println("Список продуктов: " + productService.getProducts());
        productService.delete(potato);
        System.out.println("Список продуктов: " + productService.getProducts());


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


        Recipes garnish = new Recipes("Салат");
        garnish.addProduct(potato, 3);
        garnish.addProduct(carrot, 2);
        garnish.addProduct(onion, 1);

        System.out.println("Стоимость продуктов " + garnish +
                " cоставляет " + garnish.makeRecipePrice() + " рублей.");

        Recipes salad = new Recipes("Компот");
        salad.addProduct(oranges, 2);
        salad.addProduct(apples, 2);
        salad.addProduct(lemon, 1);

        System.out.println("Стоимость продуктов " + salad +
                " cоставляет " + salad.makeRecipePrice() + " рублей.");


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

        Passport ivan = new Passport(
                Collections.singleton("112233"),
                "Иванов",
                "Иван",
                "Иванович", "11.10.2000");
        Passport sergei = new Passport(
                Collections.singleton("112244"),
                "Петров",
                "Петр",
                "Петрович",
                "12.10.2000");
        Passport andrei = new Passport(
                Collections.singleton("112255"),
                "Алексеев",
                "Алексей",
                "Алексеевич",
                "13.10.2000");

        Set<Passport> passportSets = new HashSet<>();
        passportSets.add(ivan);
        passportSets.add(sergei);
        passportSets.add(andrei);

        Iterator itr = passportSets.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Паспорт: " + find(passportSets, "112255"));





    }

    public static void decide (ArrayList<Integer> list){
        int sum = 20;
        for(int i = 0;i<sum;i++) {
            list.add((int)(Math.random()*1000));
        }
        System.out.println(list.toString());
        for(int i = 0;i<list.size();i++) {
            if(list.get(i) % 2 != 0)list.remove(i);
        }
        System.out.println(list);

    }

    public static Passport find(Set<Passport> passportSets, String number) {
        for (Passport passports: passportSets) {
            if (passports.isSetNumber(number)) {
                return passports;
            }
        }
        return null;
    }


}







