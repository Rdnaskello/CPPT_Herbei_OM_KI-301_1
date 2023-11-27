# CrimrnalDog.py
from Dog import Dog

class CriminalDog(Dog):
    def __init__(self, name, age, breed):
        super().__init__(name, age)
        self.breed = breed
    
    def sad(self):
        print(f"{self.name}: Oh no, I got caught for theft!")
