package javaSe.collection.list;

public class NodeTest {
	Node head = null;

	/**
	 * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
	 * 
	 */
	class Node {
		int data;// 节点对象即内容
		Node next = null; // 节点引用指向下一级节点

		public Node(int data) {
			this.data = data;
		}
	}

	/**
	 * 向链表中插入数据
	 * 
	 */
	public void addNode(int data) {
		// 实例化一个节点
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}

	/**
	 * 
	 * @param index:删除第index个节点
	 */
	public boolean deleteNode(int index) {
		if (index < 1 || index > length()) {
			return false;
		}
		if (index == 1) {
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node curNode = preNode.next;
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return false;
	}

	/**
	 * 
	 * @return 返回节点长度
	 */
	public int length() {
		int length = 0;
		Node tmp = head;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}

}
