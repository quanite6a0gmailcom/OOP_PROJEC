package inteface;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface HistoryMethod {
	void show() throws IOException, ParseException;
	void searchByName(String name) throws IOException, ParseException;
	void searchID(int ID) throws IOException, ParseException;
}
