package com.example.studystream.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = CoursesNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleCoursesNotFoundException (CoursesNotFoundException exeption, WebRequest request)
	{
		ErrorDetails details = new ErrorDetails();
		details.setMessage(exeption.getMessage());
		details.setDate(new Date());
		details.setPath(request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = StudyMaterialNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleStudyMaterialNotFoundException (StudyMaterialNotFoundException exception, WebRequest request)
	{
		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setDate(new Date());
		details.setPath(request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=MethodArgumentNotValidException.class)
	public ResponseEntity<Object>
	handleMethodArgumentNotValidException (MethodArgumentNotValidException ex , WebRequest req)
	{
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((e)->
		{
			String fieldName = ((FieldError)e).getField();
			String message = e.getDefaultMessage();
			errors.put(fieldName, message);
			});
		return new ResponseEntity<Object>(errors,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception exception, WebRequest request) {
		ErrorDetails details = new ErrorDetails();
		details.setMessage(exception.getMessage());
		details.setDate(new Date());
		details.setPath(request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
