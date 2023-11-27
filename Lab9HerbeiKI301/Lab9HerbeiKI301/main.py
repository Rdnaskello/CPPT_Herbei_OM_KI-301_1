# Main.py
from CriminalDog import CriminalDog
from PoliceDog import PoliceDog

if __name__ == "__main__":
    police_dog = PoliceDog("Rex", 3, "German Shepherd")

    print(f"Name: {police_dog.name}")
    print(f"Age: {police_dog.age}")
    print(f"Breed: {police_dog.breed}")
    police_dog.chase_criminal()
    police_dog.bark()
    
    crimenal_dog = CriminalDog("Bobik", 7, "Shih Tzu")
    print(f"Name: {crimenal_dog.name}")
    print(f"Age: {crimenal_dog.age}")
    print(f"Breed: {crimenal_dog.breed}")
   
    crimenal_dog.sad()
    crimenal_dog.bark()

    
    