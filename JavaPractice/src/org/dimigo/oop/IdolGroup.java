/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author		: 김지현
 * @version		: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] idolGroup={"빅뱅","2NE1","걸스데이"};
		
		String[][] members={
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"}
		};
		
		for(int i=0; i<idolGroup.length; i++) {
			System.out.print("<< "+idolGroup[i]+" 멤버"+" >>");
			System.out.println();
				for(String arr : members[i]) {
					System.out.println(arr);
				}
				System.out.println();
		}

	}

}
