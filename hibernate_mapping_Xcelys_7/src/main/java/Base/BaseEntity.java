package Base;

import java.lang.reflect.Method;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

 
public class BaseEntity {


	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("#{");
		try{
			Class  thisclass = getClass();
			Method [] methods =   thisclass.getDeclaredMethods();
			if(thisclass.getAnnotation(Embeddable.class)!= null){
				
				for(Method amethod : methods) {
					Column columnAnnotation =  amethod.getAnnotation(Column.class);
					String methname = amethod.getName();
					if(columnAnnotation!=null) {
						Object methreturn = amethod.invoke(this, null);
            			sb.append(methname.substring(3)+" : "+  methreturn.toString()+" ");
					}
				}
				
			}else{
				
			for(Method amethod : methods) {
		            Id idAnnotation =  amethod.getAnnotation(Id.class);
		            EmbeddedId embidAnnotation = amethod.getAnnotation(EmbeddedId.class);
		            if(idAnnotation!=null) {
		                    sb.append(amethod.getName().substring(3)+" : "+(amethod.invoke(this, null)).toString());	
		                    break;
		            }
		            if(embidAnnotation!=null) {
		            	Class returntype = amethod.getReturnType();
		            	Method[] methodi = returntype.getMethods();
		            	Object embeddid = amethod.invoke(this, null);
		            	for(Method currmeth : methodi){
		            		String methname = currmeth.getName();
		            		if(methname.contains("get") && !methname.contains("Class")){
		            			Object methreturn = currmeth.invoke(embeddid, null);
		            			sb.append(methname.substring(3)+" : "+  methreturn.toString()+" ");
		            		}
		            	}
			            break;
		            }
			}
		}
	 }catch(Exception e){sb = new StringBuilder("Problem retrieving the Id.toString()"+e.getMessage());}
	 sb.append("}");
	 return sb.toString();
	}
}
