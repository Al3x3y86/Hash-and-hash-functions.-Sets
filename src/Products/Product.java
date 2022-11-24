package Products;

import java.util.Objects;

public abstract class Product {

    private String name;
    private int amount;
    private double price;

    public Product(String name, int amount, double price) {
        setName(name);
        setAmount(amount);
        setPrice(price);
    }

      @Override
    public String toString() {
        return "Продукт: " + name + ", количество: " + amount +", стоимость: " + price  ;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Необходимо заполнить наименование продукта!");
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new RuntimeException("Необходимо заполнить правильно количество!");
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Необходимо заполнить правильно цену!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return amount == product.amount && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, price);
    }


}
