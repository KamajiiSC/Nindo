class Character:
  def __init__(self, name, health):
    self.name = name
    self.health = health

def attack(user):
  print(f"{user.name} swings their sword")

enemy = Character("John", 20)
playerCharacter = Character(input("Who are you? "), 20)

print(f"{playerCharacter.name} say hello to {enemy.name}")

#attack(enemy)