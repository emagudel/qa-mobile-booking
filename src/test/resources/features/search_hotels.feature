Feature: Servicio de Alojamiento
  Yo como usuario de Booking
  Quiero seleccionar una alojamiento en la application
  Para realizar la reserva

  Scenario: Reservar en el mismo mes un alojamiento para dos personas adultas y un infante
    Given que "Erik" abre la app de booking para navegar e ingrese la ciudad destino "cusco"
    And selecciona la fecha de estadia es del "10 August 2023" al "20 August 2023"
    And al seleccionar "3" habitacion o habitaciones "4" adulto o adultos y "5" niño o niños
    When elige la habitacion y realiza la reserva
    Then el usuario deberia poder realizar la reserva exitosamente

