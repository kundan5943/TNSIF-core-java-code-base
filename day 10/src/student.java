
public class student {
	
	private String studname;
	private int studrollno;
	public student(String studname, int studrollno) {
		super();
		this.studname = studname;
		this.studrollno = studrollno;
	}
	@Override
	public String toString() {
		return "student [studname=" + studname + ", studrollno=" + studrollno + "]";
	}
	

}
