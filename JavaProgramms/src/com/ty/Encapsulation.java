package com.ty;

public class Encapsulation {

	   private String name;
	    private int age;

	   
	    public String getName() {
	        return name;
	    }

	   
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public int getAge() {
	        return age;
	    }

	    
	    public void setAge(int age) {
	        if (age > 0) { 
	            this.age = age;
	        } else {
	            System.out.println("Age must be positive.");
	        }
	    }

	    public static void main(String[] args) {
	        Encapsulation person = new Encapsulation();

	        
	        person.setName("DAIVSHILA");
	        person.setAge(22);

	        
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        
	        person.setAge(-5);  
	    }
	}

