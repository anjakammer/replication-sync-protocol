#A requests B to synchronize DBs

// A: lockDB()

A to B: requestDelta() -> DB-LineUp.json

// B: LockDB()

B to A: getDelta(DB-LineUp.json) -> DB-Delta.json