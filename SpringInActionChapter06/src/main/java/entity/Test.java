package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Test_table")
public class Test {
	private Integer id;
	private String name;
	private String colonna3;
	
	@Id
	@Column(name="col1")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="col2")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="col3")
	public String getColonna3() {
		return colonna3;
	}
	public void setColonna3(String colonna3) {
		this.colonna3 = colonna3;
	}

}
