
public class Student implements Comparable<Student> {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer() throws prumerException {
		if (studijniPrumer==0)
			throw new prumerException();
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws prumerException {
		if (studijniPrumer<1||studijniPrumer>5)
			throw new prumerException("Zadan nespravny prumer");
		this.studijniPrumer = studijniPrumer;
	}
	private String jmeno;
	private int rocnik;
	private float studijniPrumer;

	@Override
	public int compareTo(Student o) {
		try {
			if (this.studijniPrumer > o.getStudijniPrumer()) {
				return 1;
			}
			if (this.studijniPrumer < o.getStudijniPrumer()) {
				return -1;
			}
			return 0;
		} catch (prumerException e) {
			throw new RuntimeException(e);
		}
	}
}