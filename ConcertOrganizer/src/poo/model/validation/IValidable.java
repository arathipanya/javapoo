package poo.model.validation;

import poo.model.validation.ValidationException;

public interface IValidable
{
	public void validate() throws ValidationException;
}
