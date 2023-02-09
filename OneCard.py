class OneCard: 
    owner: str = ""
    balance: float = 0.0

    def __init__(self, name, starting_balance) -> None:
        self.owner = name
        self.balance = starting_balance

    def CanAfford(self, cost) -> bool:
        if (cost <= self.balance):
            return True
        else: #cost > self.balance
            return False

    def deposit(self, amt_deposit) -> None: 
        self.balance += amt_deposit

    def spend(self, amt_deposit) -> None: 
        if self.CanAfford(amt_deposit):
            self.balance -= amt_deposit 
        else:
            print("insufficient funds")

def main():
    my_card = OneCard("Abbey", 10.0)
    print(my_card.owner, "has", my_card.balance, "on card")
    print(my_card.CanAfford(200))
    my_card.deposit(2000)
    print(my_card.owner, "has", my_card.balance, "on card")
    print(my_card.CanAfford(200))


main()
