public class ConnectedState implements ConnectionState {

    @Override
    public void dial(String key, Connection connection) {
        if (key.equals("#")) {
            connection.currentMailbox = connection.system.findMailbox(connection.accumulatedKeys);
            if (connection.currentMailbox != null) {
                connection.currentState= new RecordingState();
                connection.speakToAllUIs(connection.currentMailbox.getGreeting());

            } else {
                connection.speakToAllUIs("Incorrect mailbox number. Try again!");
            }
            connection.accumulatedKeys = "";
        } else {
            connection.accumulatedKeys += key;
        }
    }

    @Override
    public int getState() {
        return 1;
    }

}
