package com.atr.principles.dependency_inversion;

/**
 * Entities must depend on abstractions and not on concretions
 *
 * */

interface DBConnectionInterface {
    int connect();
}

class MySqlConnection implements DBConnectionInterface {
    @Override
    public int connect() {
        return 1;
    }
}


class PasswordReminder {
    private int dbConnection;
    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection.connect();
    }
}

public class DependencyInversion {
}
