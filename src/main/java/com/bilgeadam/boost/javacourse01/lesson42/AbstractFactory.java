package com.bilgeadam.boost.javacourse01.lesson42;

public interface AbstractFactory<T> {
	
	T create(String type);
}
