
public interface ConnectionState {
	void dial(String key, Connection c);
	int getState();
}