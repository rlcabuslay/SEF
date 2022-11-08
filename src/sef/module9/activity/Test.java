package sef.module9.activity;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        RadarImpl radarImpl = new RadarImpl();
        RadarContactImpl radarContactImpl1 = new RadarContactImpl("R1", 15.0D, 1000.0D);
        RadarContactImpl radarContactImpl2 = new RadarContactImpl("R2", 360.0D, 2000.0D);
        RadarContactImpl radarContactImpl3 = new RadarContactImpl("R3", 180.0D, 122.3D);
        radarImpl.addContact((RadarContact)radarContactImpl1);
        radarImpl.addContact((RadarContact)radarContactImpl2);
        radarImpl.addContact((RadarContact)radarContactImpl3);
        List list = radarImpl.returnContacts();
        
        System.out.println(list.contains(radarContactImpl1));
        System.out.println(list.contains(radarContactImpl2));
        System.out.println(list.contains(radarContactImpl3));
        
        System.out.println(radarImpl.getContactCount());
        
        list.remove(radarContactImpl1);
        
        System.out.println(radarImpl.getContactCount());
    }

}
