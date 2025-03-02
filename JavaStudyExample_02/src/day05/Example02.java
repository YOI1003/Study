package day05;

import day05.Tree.Node;

// 자바 트리(tree) 구현
// 비선형 자료구조(non linear)
// --> 일직선으로 나타내지 못하는 형태
// 트리는 계층적 구조를 가지고 있습니다.(조직도)

//트리의 구현 방식
//1. 데이터와 연결 상태를 저장할 클래스 공간(Node) 생성
//2. 각각 노드들에 값을 저장합니다.
//3. 노드 간의 연결 상태를 정의합니다.


//일반적으로 가장 많이 구현되는 트리 --> 이진 트리(binary tree)
//자식 노드가 최대 2개인 트리

//데이터 조사(순회)
//순회 방식(prefix, infix, postfix)(전위,중위,후위)

//수식 표기법
//1. 연산자 우선순위를 고려해서 괄호를 묶어줍니다.
//2. 괄호 앞으로 연산자를 넘깁니다.
//3. 괄호를 지웁니다.


//prefix : A + B * (C - D) / E 연산자 피연산자 피연산자 형태로 표현
//         (A + ((B * (C - D) / E))
//         + (A / (* (B - (C D)) E ))
//         + A / * B - C D E

//infix : A + B * C / (D - E) 피연산자 연산자 피연산자 형태로 표현 (직관적이어서 가장 많이 사용됨)


//postfix : 피연산자 피연산자 연산자 형태로 표기합니다.
//(A + ((B * (C - D) / E))
//(A ((B (C D) - ) * E / ) +
// A B C D - * E / +
//1. 연산자 우선순위를 고려해서 괄호를 묶어줍니다.
//2. 괄호 뒤로 연산자를 넘깁니다.
//3. 괄호를 지웁니다.

//1. 전위(pre-order) : 루트 노드를 순회하고 왼쪽 하위 -> 오른쪽 하위 순으로 순회합니다.
//2. 중위(in-order) : 왼쪽 가장 하위 노드를 순회하고 바로 상위 노드 -> 오른쪽 하위 순으로 순회합니다.
//3. 후위(post-order) : 왼쪽 가장 하위노드를 순회하고 오른쪽 하위 -> 바로 상위 노드 순으로 순회합니다.
//4 - 5 - 2 - 6 - 7 - 3 - 1


class Tree
{
	int count; //트리의 개수
	
	public Tree()
	{
		count = 0;
	}
	
	//트리에서 노드 추가
	public Node addNode (Object data)
	{
		Node node = new Node(data); //데이터를 전달받아 노드 생성
		return node;
	}
	//트리에서 노드 순회(전위)
	public void preOrder(Node node)
	{
		//접근할 노드가 없다면 작업 종료
		if(node == null)
			return;
		
		System.out.print(node.data + " "); //노드의 데이터 출력
		preOrder(node.left); //왼쪽 작업
		preOrder(node.right);
	}
	public void inOrder(Node node)	
	{
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	//트리에서 노드 순회(후위)
	public void postOrder(Node node)
	{
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	
 	class Node
	{
		//노드에 대한 필드
		Object data; //연결될 데이터
		Node left; //왼쪽 연결 노드
		Node right; //오른쪽 연결 노드
		
		//노드에 대한 생성자
		public Node(Object data)
		{
			this.data = data; //데이터 연결
			left = null; //방향 연결은 하지 않았음으로 null
			right = null;
		}
		
		public void addLeft(Node node)
		{
			left = node;
			count++;
		}
		public void addRight(Node node)
		{
			right = node;
			count++;
		}
		public void deleteLeft(Node node)
		{
			left = null;
			count--;
		}
		public void deleteRight(Node node)
		{
			right = null;
			count--;
		}
	}
}




public class Example02 {

	public static void main(String[] args) {
		
		Tree tree = new Tree(); //트리 생성
		
		//노드 생성
		Node node01 = tree.addNode(1);
		Node node02 = tree.addNode(2);
		Node node03 = tree.addNode(3);
		Node node04 = tree.addNode(4);
		Node node05 = tree.addNode(5);
		Node node06 = tree.addNode(6);
		Node node07 = tree.addNode(7);
		
		//트리에 연결
		node01.addLeft(node02); //제일 처음 연결한 노드 == 루트
		node01.addRight(node03); //노드 02와 노드 03은 노드 01의 자식 노드가 됩니다.(이전 트리 구현)
		//  1
		//2   3
		node02.addLeft(node04);
		node02.addRight(node05);
		node03.addLeft(node06);
		node03.addRight(node07);
		//    1
		//  2   3
		//4  5 6  7
		
		
		//순회 진행
		tree.preOrder(node01);
		System.out.println();
		tree.inOrder(node01);
		System.out.println();
		tree.postOrder(node01);
		System.out.println();
		
	}

}
