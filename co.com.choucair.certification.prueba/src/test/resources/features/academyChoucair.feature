#Autor: Alejandra Rosero
  @stories
  Feature: Academy Choucair

    As a user, I want to learn how to automate in screenplay at the choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than Alejandra wants to learn automation at the academy choucair
      | strUser    | strPassword      |
      | 1016108431 | Choucair2021*    |
      When she search fot the course  on the choucair academy platform

      Then She finds the course called resources Prueba Técnica - Analista Bancolombia
