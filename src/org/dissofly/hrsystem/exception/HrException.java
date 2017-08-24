package org.dissofly.hrsystem.exception;
public class HrException extends RuntimeException
{
	public HrException(){}
	public HrException(String msg)
	{
		super(msg);
	}
}