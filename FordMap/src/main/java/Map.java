
public class Map<T1, T2> {
	
	private int i=0;
		private int sizeA=10;
	private T1[] arrayKey = (T1[]) new Object[sizeA];
	private T2[] arrayValue = (T2[]) new Object[sizeA];
	
	public int size() {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0; i<arrayValue.length; i++) {
			if(arrayValue[i]==null)
			{
				flag=i;
				break;
			}
								
		}
		return flag;
	}
	
	public void extend() {
		 sizeA=sizeA+25;
		 T1[] newKey=(T1[]) new Object[sizeA+25];
		 T2[] newValue=(T2[]) new Object[sizeA+25];
		
		for(int i=0;i<sizeA+25;i++) {
			newKey[i]=arrayKey[i];
			newValue[i]=arrayValue[i];
			
		}
		
		 arrayKey= newKey;
		 arrayValue= newValue;
		
	}
	
	
	public void add(T1 key, T2 value) {
		int v=i++;
		arrayKey[v]=key;
		arrayValue[v]=value;
		if(v>=arrayKey.length) {
			
		}
	}
	
	public T2 getValue(T1 key) {
		int flag=0;
		for(int i=0; i<arrayKey.length; i++) {
			if(arrayKey[i]==key)
				flag=i;				
		}
		return arrayValue[flag];
			
	}
	
	public void Delete(T1 key) throws NullPointerException {
		for(int i=0; i<this.size(); i++) {
			if(arrayKey[i]==key) {
				if(i!=this.size()-1) {
					for(int j=i; j<this.size()-1; j++) {
						arrayKey[j]=arrayKey[j+1];
						arrayValue[j]=arrayValue[j+1];
				}}
				arrayKey[this.size()-1]=null;
				arrayValue[this.size()-1]=null;
				
			}
		}
		throw new NullPointerException();
	}
	
	
	
}
