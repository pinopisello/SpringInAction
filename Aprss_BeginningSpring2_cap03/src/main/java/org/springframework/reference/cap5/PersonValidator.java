package org.springframework.reference.cap5;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		Person p = (Person) obj;
		if (p.getAge() < 0) {
		e.rejectValue("age", "negativevalue");
		} else if (p.getAge() > 110) {
		e.rejectValue("age", "too.darn.old");
		}
	}

}
