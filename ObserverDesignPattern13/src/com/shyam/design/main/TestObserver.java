package com.shyam.design.main;

import java.util.ArrayList;

import com.shyam.design.Commentary;
import com.shyam.design.Observer;
import com.shyam.design.Subject;
import com.shyam.design.impl.CommentaryObject;
import com.shyam.design.impl.SMSUsers;

public class TestObserver {
public static void main(String[] args) {
	
Subject subject=new CommentaryObject(new ArrayList<Observer>(),"Soccer Math 2026");

Observer observer=new SMSUsers(subject,"Shyam");
observer.subcribe();

Observer observer2=new SMSUsers(subject,"Ravi");
observer2.subcribe();

Commentary cObject=((Commentary)subject);
cObject.setDesc("Welcome to Soccer Match 2026");
cObject.setDesc("Team A won the toss and elected to bat first");


observer2.unSubcribe();

subject.notifyObserver();

}
}
