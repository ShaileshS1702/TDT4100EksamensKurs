Dette er ikke en eksamensoppgave, men den er inspirert av strukturen til eksamens oppgaver. Jeg fant ikke noe som passet godt for både delegering og obersvatør observert så jeg lagde en egen oppgave.

# Oppgave

Mini PC. 

Her skal vi lage det som er en enkel versjon av en PC. Vi har 4 klasser, CPU, Core, Memory og Program. 

CPU har en liste med Cores og en liste med Programs. En CPU blir opprettet med et antall kjerner. 

En CPU får en liste med Program objekter som den skal kjøre. Hvert program har en liste med instruksjoner. Vi implementerer dette via funksjonelle grensesnitt. Vi har også en spesiell instruksjon som sier til CPUen at programmet er ferdig. Når programmet er ferdig skal CPUen fjerne programmet fra listen sin.

En CPU skal delegere instruksjonene til kjernene sine via binaryoperator funksjonen

Når CPUen får data tilbake fra en core skal den sende det til Memory. Memory har en funksjon saveData som tar in data og lagrer det.

Når CPUen får den spesielle jeg er ferdig instruksjonen skal den varsle programet at det ligger data i minnet. Programmet skal da hente dataen skrive det ut og si god natt. (Altså programmet er ferdig)


Denne oppgaven bruker både observatør observert og delegering.



