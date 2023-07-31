Feature: Servicio de Alojamiento
  Yo como usuario de Booking
  Quiero seleccionar una alojamiento en la application
  Para realizar la reserva

  Scenario: Reserva de Alojamiento para dos personas y un infante
    Given que "Erik" se encuentra en la pagina
    When el usuario ingrese la ciudad destino "CUSCO"
    And la fecha de estadia "14 Febrero" a "28 Febrero" del 2023
    And selecciona el numero de habitacion "1" el numero adultos "1"
    And la edad de los niños "5" años y "1" niño
    Then el usuario deberia poder realizar la reserva del alojamiento

