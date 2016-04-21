
public interface ConnectionState {

	/**
	      Respond to the user's pressing a key on the phone touchpad
	      @param key the phone key pressed by the user
	   */
	void dial(String key, Connection c);

//	void dial(String key);

}