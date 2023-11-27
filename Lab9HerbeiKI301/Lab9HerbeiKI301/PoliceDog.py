# PoliceDog.py
from Dog import Dog

class PoliceDog(Dog):
    def __init__(self, name, age, breed):
        super().__init__(name, age)
        self.breed = breed
    
    def chase_criminal(self):
        print(f"{self.name} is chasing a criminal!")
