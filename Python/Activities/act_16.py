class Car:
    'This class represents a car'
    def __init__(self, manufacture, model):
        self.manufacture=manufacture
        self.model=model
    def accelerate(self):
        print(self.manufacture, self.model, " is moving")
    def stop(self):
        print(self.manufacture, self.model, " has stopped moving")

car1 = Car("Toyota", "Corolla")
	
car2 = Car("Maruti", "800")
	
car3 = Car("Suzuki", "Swift")

car1.accelerate()
car3.stop()
