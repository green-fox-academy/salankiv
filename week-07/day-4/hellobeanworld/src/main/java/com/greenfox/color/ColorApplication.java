package com.greenfox.color;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorApplication {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ColorConfig.class);

		Color newColor = container.getBean(YellowColor.class);
		newColor.printColor();
	}
}
