package programaGastoEmpresa;

import java.util.Date;

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
	
	
		public Date getDate() {
			return date;
		}
	
	
		public void setDate(MyDate date) {
			this.date = date;
		}
	
	
		@Override
		public String toString() {
			return "Expense [nombre=" + nombre + ", expense=" + expense + ", date=" + date + "]";
		}

		public Object getName() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setValue(double valueExpense) {
			// TODO Auto-generated method stub
			
		}
		
	//commit push
}

