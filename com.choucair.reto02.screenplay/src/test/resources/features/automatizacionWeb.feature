#Author: ygonzalezg@choucairtesting.com

@stories
Feature: Manage Medical Appointment
  As a patient, I want to request a medical appointment through the hospital administration system

  @scenario1
  Scenario: Register a Doctor
    Given than Carlos needs to register a new doctor
    When he registers it in the Hospital Administration application
      |nombreCompleto   |apellidos	      |telefono   |tipoDocumento	    |idDoctor  	|
      |Jorge Jose       |Jacir Jackson    |765-4567   |Cédula de ciudadanía |7-56-789   |
    Then he verifies that it displayed on the screen the message Datos guardados correctamente.

  @scenario2
  Scenario: Register a Patient
    Given than Carlos needs to register a new patient
    When he registers it in the Hospitals Administration application
      |nombreCompleto   |apellidos	    |telefono   |tipoDocumento	        |idPaciente 	|
      |Paola Paulet     |Pabon Pioli    |123-4567   |Cédula de extrangería  |E-7-76-543      |
    Then he verifies that it displayed on the screen the message Datos guardados correctamente.

  @scenario3
  Scenario: Register an appointment
    Given than Carlos needs to go to the doctor
    When he registers an appointment
      |diaCita    |idPaciente   |idDoctor   |observaciones	                                  |
      |07/07/2020 |E-7-76-543   |7-56-789   |Cita de control con medicina general. Dr. Carlos |
    Then he verifies that it displayed on the screen the message Datos guardados correctamente.
