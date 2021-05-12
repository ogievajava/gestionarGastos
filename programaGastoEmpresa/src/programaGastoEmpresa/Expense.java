package programaGastoEmpresa;

public class Expense {

	String nombre = "";
	double expense = 0;
	MyDate date;
	
	
	public Expense (String nombre, double expense, MyDate date) {
		this.nombre = nombre;
		this.expense = expense;
		this.date = date;
		}
	
		public String getNombre() {
			return nombre;
		}
	
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
	
		public double getExpense() {
			return expense;
		}
	
	
		public void setExpense(double expense) {
			this.expense = expense;
		}
	
	
		public MyDate getDate() {
			return date;
		}
	
	
		public void setDate(MyDate date) {
			this.date = date;
		}
	
	
		@Override
		public String toString() {
			return "Expense [nombre=" + nombre + ", expense=" + expense + ", date=" + date + "]";
		}
		
	
}

