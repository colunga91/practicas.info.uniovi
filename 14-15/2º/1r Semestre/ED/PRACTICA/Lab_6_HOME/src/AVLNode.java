


public class AVLNode <T extends Comparable <T>> {

	private T element;
	private AVLNode<T> left;
	private AVLNode<T> right;
	private int height;
	
	//Constructors.
	public AVLNode (T element)
	{
		setElement(element);
		setLeft(null);
		setRight(null);
		setHeight(0);
	}
	
	public AVLNode (T element, AVLNode<T> left, AVLNode<T> right)
	{
		setElement(element);
		setLeft(left);
		setRight(right);
	}
	
	
	//SETTERS AND GETTERS
	
	/**
	 * Getter. Returns the element.
	 * 
	 * @return the T element.
	 */
	public T getElement()
	{
		return element;
	}
	
	/**
	 * Setter. Sets the value for the element.
	 * 
	 * @param Element e to be set.
	 */
	public void setElement(T e)
	{
		this.element = (T) e;
	}
	
	/**
	 * Getter. Returns the left node.
	 * 
	 * @return the AVLNode<T> left node.
	 */
	public AVLNode<T> getLeft()
	{
		return left;
	}
	
	/**
	 * Setter.
	 * 
	 * @param e
	 */
	public void setLeft(AVLNode<T> e)
	{
		this.left = e;
	}
	
	/**
	 * Getter. Returns the right node.
	 * 
	 * @return the AVLNode<T> right node.
	 */
	public AVLNode<T> getRight()
	{
		return right;
	}
	
	/**
	 * Setter
	 * 
	 * @param e
	 */
	public void setRight(AVLNode<T> e)
	{
		this.right = e;
	}
	
	/**
	 * Getter. Returns the height of the tree.
	 * 
	 * @return the int height of the tree.
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Setter
	 * 
	 * @param h
	 */
	public void setHeight(int h)
	{
		this.height = h;
	}
	
	//METHODS
	
	/**
	 * CompareTo method, compare two elements.
	 * 
	 * @param AVLNode<T> o, element to be compared
	 * @return -1 if the eleemnt is <, 0 if the elements are equals and 1 if >.
	 */
	public int compareTo(AVLNode<T> o)
	{	
		return element.compareTo(o.getElement());
	}
	
	public String toString()
	{
		return getElement().toString() + "("+getHeight()+")";
	}
	
	public void print()
	{}
	
	public void updateHeight()
	{
		if (getLeft() == null && getRight() == null) {
			setHeight(1);
		} else if (getLeft() != null && getRight() == null) {
			setHeight(getLeft().getHeight() + 1);
		} else if (getLeft() == null && getRight() != null) {
			setHeight(getRight().getHeight() + 1);
		} else if (getLeft() != null && getRight() != null) {
			setHeight(max(getLeft().getHeight(), getRight().getHeight()) + 1);
		}
	}

	private int max(int h2, int h3) {
		if(h2>h3)
			return h2;
		else
			return h3;
	}
	
}
