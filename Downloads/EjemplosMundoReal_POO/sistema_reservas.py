# Clase Habitacion
# Representa una habitación del hotel
class Habitacion:
    def __init__(self, numero, tipo, precio):
        self.numero = numero
        self.tipo = tipo
        self.precio = precio
        self.disponible = True

    def reservar(self):
        self.disponible = False

    def liberar(self):
        self.disponible = True


# Clase Cliente
# Representa a un cliente del hotel
class Cliente:
    def __init__(self, nombre, cedula):
        self.nombre = nombre
        self.cedula = cedula


# Clase Reserva
# Relaciona un cliente con una habitación
class Reserva:
    def __init__(self, cliente, habitacion, noches):
        self.cliente = cliente
        self.habitacion = habitacion
        self.noches = noches
        self.total = noches * habitacion.precio

    def confirmar_reserva(self):
        if self.habitacion.disponible:
            self.habitacion.reservar()
            print("Reserva confirmada")
            print("Cliente:", self.cliente.nombre)
            print("Habitación:", self.habitacion.numero)
            print("Total a pagar: $", self.total)
        else:
            print("La habitación no está disponible")


# Programa principal
habitacion1 = Habitacion(101, "Simple", 25)
cliente1 = Cliente("Luis Asencio", "0701234567")

reserva1 = Reserva(cliente1, habitacion1, 3)
reserva1.confirmar_reserva()
