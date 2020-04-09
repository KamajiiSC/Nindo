class Character:
  def __init__(self, name, health):
    self.name = name
    self.health = health

enemy = Character("John", 20)

print(f"Say hello to {enemy.name}")