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

while enemy.health > 0 and playerCharacter.health > 0:
  action = input("What do you do: ")
  if action == "attack":
    attack(playerCharacter)
    print(f"{enemy.name} takes 5 hitpoints of damage")

else:
  print(f"{enemy.name} has fallen")

#attack(enemy)