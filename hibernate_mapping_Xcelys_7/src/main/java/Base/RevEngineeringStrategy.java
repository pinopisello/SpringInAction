package Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;
import org.hibernate.mapping.MetaAttribute;

 

public class RevEngineeringStrategy extends DelegatingReverseEngineeringStrategy{
		
	  public RevEngineeringStrategy(ReverseEngineeringStrategy delegate) {
		    super(delegate);
		  }
	  
	@Override
	public String tableToClassName(TableIdentifier tableIdentifier) {
		//Cambio i nomi per le CM entities qui perche col reverse_eng.xml non funge
		if("MSSGCO1V".equals(tableIdentifier.getName()))
			return "CM.Entity.Contract";
		else if("MSCTBC1V".equals(tableIdentifier.getName()))
			return "CM.Entity.Benefit";
		else
		return super.tableToClassName(tableIdentifier);
	}
	  
	@Override
	public List getPrimaryKeyColumnNames(TableIdentifier identifier) {
		if("MSSGCO1V".equals(identifier.getName())){
			List ret = new ArrayList();
			ret.add("CTRCT_ID");
			ret.add("GRP_ID");
			ret.add("SGRP_ID");
			return ret;
		} 
		else
		return super.getPrimaryKeyColumnNames(identifier);
	}
	
	
	 public Map tableToMetaAttributes(TableIdentifier tableIdentifier)
	    {
	        Map<String, MetaAttribute> metaAttributes = new HashMap<String, MetaAttribute>();
			Map<String, MetaAttribute> supermetaAttributes = super.tableToMetaAttributes(new TableIdentifier(null,null,tableIdentifier.getName()));
			if(supermetaAttributes != null && !supermetaAttributes.isEmpty()){
				metaAttributes.putAll(supermetaAttributes);
			}

	          MetaAttribute extendsCode = new MetaAttribute("extends");
	          extendsCode.addValue("Base.BaseEntity");
	          metaAttributes.put("extends", extendsCode);
	        
	          MetaAttribute importjavaxpersistence = new MetaAttribute("extra-import");  
	          importjavaxpersistence.addValue("javax.persistence.ManyToMany");
	          importjavaxpersistence.addValue("javax.persistence.CascadeType");
	          importjavaxpersistence.addValue("javax.persistence.JoinTable");
	          importjavaxpersistence.addValue("javax.persistence.JoinColumn");
	          importjavaxpersistence.addValue("javax.persistence.JoinColumns");
	          importjavaxpersistence.addValue("javax.persistence.OneToMany");
	          importjavaxpersistence.addValue("javax.persistence.ManyToOne");
	          importjavaxpersistence.addValue("javax.persistence.FetchType");
	          importjavaxpersistence.addValue("java.util.*"); 
	          metaAttributes.put("extra-import", importjavaxpersistence);
	         
	          
	          /*MetaAttribute classcode = new MetaAttribute("class-code");  
	          classcode.addValue("pippo");
	          metaAttributes.put("class-code", classcode);*/
	        return metaAttributes;
	    }
 
}
