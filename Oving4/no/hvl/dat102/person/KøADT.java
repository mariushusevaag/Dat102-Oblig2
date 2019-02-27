package no.hvl.dat102.person;

public interface KøADT<T> {
	
	public void enqueue(T element);
	
	public T dequeue();
	
	public T first();
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();

}