#A requests B to synchronize DBs

A: lockDB()

A: getDBLineUp() -> DB-LineUp.json

A to B: requestDelta(DB-LineUp.json)

B: lockDB()

B: getDelta(DB-LineUp.json) 

B to A: sendDelta(DB-Delta.json)
