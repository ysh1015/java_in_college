
public class WhatIsMultiThread {

	/*
	 *sleep()
	 *- 주어진 시간 동안 쓰레드를 일시정지 상태로 만든다. 시간이 지나면 자동으로 실행대기 상태가 된다 
	 * 
	 * join()
	 * - 쓰레드의 join 메서드는 다른 쓰레드를 기다릴 때 사용
	 * 
	 * yield()
	 * - 다른 쓰레드가 먼저 실행될 수 있도록 양보하는 메서드
	 * 
	 * 
	 * wait, notify, notifyAll
	 * - Object 클래스에서 선언된 메서드
	 * 
	 * 
	 * 동기화란(synchronized)?
	 * - 멀티쓰레드 환경에서 공유자원에 대한 접근을 제어 
	 * - 하나의 데이터에 대해 다수의 접근을 하는 경우 한번에 하나씩만 접근할수 있도록 하는 것
	 * - 동기화 메서드, 동기화 블록을 자바에서 제공
	 * - 일반 메서드는 동시 사용가능 
	 * - 자바에서 동기화 사용 2가지
	 * 	  	1.  synchronized 키워드를 붙여서 동기화 메서드 및 블록 선언으로 사용
	 * 		2.  wait(), notify() 메서드로 스레드의 실행순서 제어
	 * - 단 쓰레드가 2개이상 필요, 공유 객체가 필요하기 때문에 메인 클래스 포함 최소 4개 이상의 클래스가 필요하다
	 * - 화장실이라고 생각하면 된다.
	 * 
	 * 
	 * 
	 * 
	 * */
}
