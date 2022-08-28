package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    //테스트 코드를 사용하면 테스트 메소드를 독립저긍로 실행 할 수 있기때문에
    //지금 내가 구현하고 있는 프로덕션 코드의 메서드만 집중할 수 있다.
    //2. 중복 코드 제거

    private Calculator calculator;

    //매 테스트시 시작 전 setUp 메서드를 실행
    //어떤 테스트든 해당 테스트는 반복을 해도 같은 값(성공)이 나와야하기 때문에 시작전 초기화 작업을 진행해준다.
    //또 테스트는 서로에게 영향을 주어서는 안된다.
    @BeforeEach void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add(){
        //Calculator calculator = new Calculator();
        //이 처럼 개발자가 눈으로 확인 해야하는 문제점이 있다.
        //System.out.println(calculator.add(6,3));
        assertEquals(9,calculator.add(6,3));
    }

}