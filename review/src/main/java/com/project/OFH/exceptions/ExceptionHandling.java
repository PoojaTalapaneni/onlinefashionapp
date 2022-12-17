package com.project.OFH.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {
			
@ExceptionHandler(ReviewNotFoundException.class)
public ResponseEntity<String> ReviewNotFoundException(ReviewNotFoundException e)
{
return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
}	

@ExceptionHandler(DateNotFoundException.class)
public ResponseEntity<String> DateNotFoundException(DateNotFoundException e)
{
return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
}
}	






