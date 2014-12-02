package bean;

import tools.AppException;
import tools.Logger;

import com.google.gson.Gson;

/**
 * whisper
 *
 * @author Sheldon
 *
 */
public class JsonMessage {
	public String file;
	public int messageType;
	public String text;
	
	public static JsonMessage parse(String res)  {
		JsonMessage data = new JsonMessage();
		Gson gson = new Gson();
		data = gson.fromJson(res, JsonMessage.class);
		return data;
	}
}
