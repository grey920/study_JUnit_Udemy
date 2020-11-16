package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

// 항상 소스코드와 테스트 코드는 다른 폴더에 위치해야 한다
public class MyMathTest {

	@Test // unit테스트를 포함한다는 뜻
	public void test() {
		// 빈 테스트를 실행해도 초록막대가 뜬다 -> 실패가 없으면 성공이다
		// 코드에서 예외가 발생하지 않았거나 모든 검사가 통과되면 테스트는 성공한다.
	}

}
