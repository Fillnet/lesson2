public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int box = 5;
        System.out.println(box);
        box += 2;
        System.out.println(box);
        box -= 3;
        System.out.println(box);
        box *= 3;
        System.out.println(box);
        box /= 4;
        System.out.println(box);
        int liftingCapacity = 50;
        int stuffWeight = 20;
        int capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");
        int appleWeight = 2;
        int orangeWeight = 3;
        int fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight + " кг");
        int meatWeight = 4;
        int waterWeight = 5;
        int tomatoesWeight = 2;
        int cucumberWeight = 2;
        int pepperWeight = 2;
        int zucchiniWeight = 2;
        int vegetableWeight = tomatoesWeight + cucumberWeight + pepperWeight + zucchiniWeight;
        int productsWeight = fruitWeight + vegetableWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");
        int leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");
        productsWeight *= 2;
        System.out.println("теперь вес продуктов " + productsWeight);
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");
        int overLoad = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overLoad + " кг!");
        int productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar + " кг!");
        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");
        float sugar = 3.0F;
        float onePortion = sugar / 4.0F;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");
        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);
        float g = (float)a + 1.0F;
        System.out.println(g);
    }
}