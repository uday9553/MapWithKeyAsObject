# MapWithKeyAsObject
# when we are using key as Custom object for Map. The Custom Object should implement Comparable interface and provide compareTo(Object obj) method implementation
# Example 
@Override
	public int compareTo(Object obj) {
		if(( obj.getId()==this.getId() ) && (obj.getName().equals(this.getName()))){
			return 0;
		}
		return 1;
	}
# Otherwise you will get ClassCastException  because it is not able to compare the objects
# Example
Exception in thread "main" java.lang.ClassCastException: class com.uday.model.Employee cannot be cast to class java.lang.Comparable (com.uday.model.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
	at java.base/java.util.TreeMap.put(TreeMap.java:536)
	at com.uday.Hash_Map_Demo.main(Hash_Map_Demo.java:17)
  
