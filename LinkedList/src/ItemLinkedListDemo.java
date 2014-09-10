
public class ItemLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemLinkedList <String>aList = new ItemLinkedList<String>();
		aList.insert("Debbie");
		aList.insert("Anthony");
		aList.insert("Yoseph");
		
		
		System.out.println(aList);
		
		System.out.println(aList.find("Debbie"));
		System.out.println(aList.find("Anthony"));
		System.out.println(aList.find("Yoseph"));
		System.out.println(aList.find("Any"));

		
		ItemLinkedList <UserInfo> uList = new ItemLinkedList <UserInfo>();
		uList.insert(new UserInfo("Debbie", "Password123"));
		uList.insert(new UserInfo("Anthony", "Password234"));
		uList.insert(new UserInfo("Yoseph", "Password345"));
		System.out.println(uList);
		
		UserInfo temp = new UserInfo("TEST","test");
		UserInfo temp1 = new UserInfo("Debbie", "Password123");
		System.out.println(uList.find(temp));
		System.out.println(uList.find(temp1));
		
		
	}

}
