package com.littletest.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "Person2.withNameAndAddressNamedQuery",query = "select p from Person2 p where p.name=?1 and p.address=?2")
public class Person2  {
	/**
	 * 
	 */
	@Id
	@GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Person2() {
    }

    public Person2(Integer id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}