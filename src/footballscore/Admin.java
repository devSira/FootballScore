/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

import java.util.ArrayList;

/**
 *
 * @author Siraphob.B
 */
public class Admin implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;

    public Admin() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String aData) {
	someData = aData;
	notifyObservers();
    }
    public String getSomeData() {
	return someData;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
