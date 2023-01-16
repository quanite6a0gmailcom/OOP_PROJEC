package period;

import java.util.ArrayList;

import abclass.History;
import historicevent.HistoricEvents;
import personage.Personage;

public class Period extends History {
	private static int ID=0;
	private int id;
	private ArrayList<String> personageList;
	private ArrayList<String> historicEvents;
	
	

	public Period(String name, String date, String description, ArrayList<String> personageList,
			ArrayList<String> historicEvents) {
		super(name, date, description);
		this.id = ++ID;
		this.personageList = personageList;
		this.historicEvents = historicEvents;
	}



	@Override
	public String toString() {
		return "Period [id=" + id + ", name=" + name + ", date=" + date + ", description=" + description
				+ ", personageList=" + personageList.toString() + ", historicEvents=" + historicEvents.toString() + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ArrayList<String> getPersonageList() {
		return personageList;
	}



	public void setPersonageList(ArrayList<String> personageList) {
		this.personageList = personageList;
	}



	public ArrayList<String> getHistoricEvents() {
		return historicEvents;
	}



	public void setHistoricEvents(ArrayList<String> historicEvents) {
		this.historicEvents = historicEvents;
	}
	
	
	
	
	
}
