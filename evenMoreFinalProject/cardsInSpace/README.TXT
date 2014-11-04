Changes to main stuff:
-Austins noble change in player, playCard lines 34-47

Class: player
Function: playCard
Comitter: Austin
Description: Checks to see if the card chosen is defensive, if so set the action to play on the players ship

George 5-20-13 edit
//added hardpoint class, clone of ship class but does not have hp or defense, juse a destroyed/nondestroyed state.  It also has attack and attack rate..
//edited ship class to contain hardpoints.  Fighter is subclass that has turrets
//implemented card "fireEverything" which fires all the hardpoints on a ship to do massive damage
//implemented "getShipToPerformAction" and "setShipToPerformAction" methods. >>added in line 60
//implemented player 1 (person to play the card) function in card class, playcard now requires a person playing and a person recieving.
//added hardpoint stuff from fighter into ship abstract class