package zadaci_18_02_2016;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	// data
	private ArrayList<Object> list = new ArrayList<>();

	// check if list is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// size getter
	public int getSize() {
		return list.size();
	}

	// enables stack insight
	public Object peek() {
		return list.get(getSize() - 1);
	}

	// removes element from the stack
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	// ads elements to the stack
	public void push(Object o) {
		list.add(o);
	}

	// clone override for deep copy
	@Override
	protected MyStack clone() throws CloneNotSupportedException {

		return (MyStack) super.clone();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
