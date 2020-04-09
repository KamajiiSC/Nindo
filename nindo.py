class Character:
  def __init__(self, name, health):
    self.name = name
    self.health = health

def attack(user):
  print(f"{user.name} swings their sword")
  if user == playerCharacter:
    enemy.health = enemy.health - 5
  elif user == enemy:
    playerCharacter.health = playerCharacter - 5

enemy = Character("John", 20)
playerCharacter = Character(input("Who are you? "), 20)

print(f"A man appears before {playerCharacter.name}. \"My name is {enemy.name}, prepare to fight!\"")


#attack(enemy)