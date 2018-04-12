# roll-cans-roll

My motivation for this was to recreate a PLC system that I've come across -- a can crusher.  The can crusher works by sending out one can at a time to a crusher at the bottom of the slope.  The system only works by making sure that the next can is only let out of the gate after the current can has been crushed and the crusher is cleared.  This example is not that can crusher system unfortunately, but it's fun to see nonetheless.

For this, 5 cans that are in a queue on a sloping surface are let out of a gate one by one.  Rolling each can object sets a time for how long it will roll, so the first out does not mean that it is going to stop first.

The system is controlled by two "devices".  A sensor checks to make sure that there is a can at the gate.  If there is one, then the gate opens.  The can rolls.  The gate closes, and the process repeats.  Each can object determines how long it's supposed to roll.
