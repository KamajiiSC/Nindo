class Character:
  def __init__(self, name, health):
    self.name = name
    self.health = health

enemy = Character("John", 20)

playerCharacter = Character(input("Who are you? "), 20)
#userName = input("Who are you? ")

print(f"{playerCharacter.name} say hello to {enemy.name}")