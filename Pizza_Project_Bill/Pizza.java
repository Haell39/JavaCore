package Pizza_Project_Bill;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    // Construtor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    // Método para adicionar queijo extra
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    // Método para adicionar toppings extras
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    // Método para adicionar a opção de levar
    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }

    // Método para gerar e exibir a fatura
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice); // Exibe o preço base da pizza

        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Opted for take away: " + backPackPrice + "\n";
        }

        bill += "Bill: " + this.price; // Exibe o valor total da fatura
        System.out.println(bill); // Exibe a fatura completa
    }
}
