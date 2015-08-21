package com.sirma.itt.javacourse.objects.task5;

/**
 * Class for creating and working with Heterogeneous tree nodes.
 * 
 * @author Georgi Tsankov
 */
public class HeterogeneousTreeNode {

	private Object value;
	private HeterogeneousTreeNode leftChild;
	private HeterogeneousTreeNode rightChild;

	/**
	 * Constructor.
	 * 
	 * @param value
	 */
	public HeterogeneousTreeNode(Object value) {
		this.value = value;
	}

	/**
	 * Constructor
	 * 
	 * @param value
	 * @param leftChildNode
	 * @param rightChildNode
	 */
	public HeterogeneousTreeNode(Object value, HeterogeneousTreeNode leftChildNode, HeterogeneousTreeNode rightChildNode) {

		if (value == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		this.value = value;
		this.leftChild = rightChildNode;
		this.rightChild = leftChildNode;
	}

	/**
	 * @return - the value of the node
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @return - the left child of the node
	 */
	public HeterogeneousTreeNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Sets the left child of the node.
	 * 
	 * @param child
	 *            - the child to be set
	 */
	public void setLeftChild(HeterogeneousTreeNode child) {
		leftChild = child;
	}

	/**
	 * @return - the right child of the node
	 */
	public HeterogeneousTreeNode getRightChild() {
		return rightChild;
	}

	/**
	 * Sets the right child of the node.
	 * 
	 * @param child
	 *            - the child to be set
	 */
	public void setRightChild(HeterogeneousTreeNode child) {
		rightChild = child;
	}

}
