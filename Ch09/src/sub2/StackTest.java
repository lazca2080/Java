package sub2;

import java.util.Stack;

/*
 * 날짜 : 2022/09/13
 * 이름 : 박종협
 * 내용 : 자료구조 stack 실습하기 
 */
public class StackTest {
	public static void main(String[] args) {
		
		// 스택 생성
		Stack<Integer> stack = new Stack<>();
				//제네릭 문법은 객체만 취급 따라서 int가 아닌 Integer
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}
}
