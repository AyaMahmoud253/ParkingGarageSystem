package Java_project_phase2;
import java.sql.Date;
import java.util.ArrayList;
public class Vehicle {
	private String model_name;
	private int model_year,ID,width,depth;
	private int slot_num;
	private long startTime;
	private Date date;
	boolean parked;
	public ArrayList<Vehicle>Cars = new ArrayList<Vehicle>();
	private ArrayList<Slots>slots = null;
	Slots slot=null;
	
	public Vehicle()
	{
		slots = new ArrayList<>();

	}
	public Vehicle(String n,int y,int id,int w,int d)
	{
		this.model_name=n;
		this.model_year=y;
		this.ID=id;
		this.width=w;
		this.depth=d;

	}
	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getSlot_num() {
		return slot_num;
	}
	public void setSlot_num(int slot_num) {
		this.slot_num = slot_num;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setparked(boolean pa) {
		parked=pa;
	}
	public boolean getparked() {
		return parked;
	}
	
}
