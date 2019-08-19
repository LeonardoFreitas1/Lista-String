
public class Lista {

	private String[] v = new String[10];
	private int n = 0;
	
	public void add(String x){
		
		if(v.length == n) {
			String[] a = new String[n + 10];
			for(int i = 0; i< n; i++) {
				a[i] = v[i];
			}
			v = a;
		}
		v[n] = x;
		System.out.print("Letra "+ x +" Adicionada a lista!");
		n++;
	}
	
	public String get(int i){
			
		return v[i];
	}
	
	public int size() {
		
		return n;
	}
	
	public void delete(int x) {
		
		for(int i = x; i != v.length; i++) {
			if(i == v.length) {
				v[i] = v[i];
				break;
			}else {
				v[i] = v[i + 1];	
			}
			
		}
	}
}
