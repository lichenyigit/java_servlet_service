package java_servlet_service.exception;


import java_servlet_service.exception.base.BaseException;

public class UserExistException extends BaseException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getErrorCode() {
		return "0100";
	}

}
