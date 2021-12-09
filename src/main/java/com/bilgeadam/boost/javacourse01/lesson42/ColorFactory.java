package com.bilgeadam.boost.javacourse01.lesson42;

import com.bilgeadam.boost.javacourse01.lesson42.color.Black;
import com.bilgeadam.boost.javacourse01.lesson42.color.Brown;
import com.bilgeadam.boost.javacourse01.lesson42.color.Color;
import com.bilgeadam.boost.javacourse01.lesson42.color.White;

public class ColorFactory implements AbstractFactory<Color> {
	
	@Override
	public Color create(String type) {
		if (type.equalsIgnoreCase("beyaz"))
			return new White();
		else if (type.equalsIgnoreCase("Siyah"))
			return new Black();
		else if (type.equalsIgnoreCase("Kahverengi"))
			return new Brown();
		else
			return null;
	}
	
}
