class Character:
  def __init__(self, name, health):
    self.name = name
    self.health = health

enemy = Character("John", 20)

userName = input("Who are you? ")

print(f"{userName} say hello to {enemy.name}")