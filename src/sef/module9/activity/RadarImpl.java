package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar
 */
public class RadarImpl implements Radar {

    private final List<RadarContact> contacts;

    /**
     * Constructs a new Radar
     */
    public RadarImpl() {
        contacts = new ArrayList<>();
    }

    /*
     * (non-Javadoc)
     * @see
     * sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
     */
    public RadarContact addContact(RadarContact contact) {
        if (contact != null) {
            boolean doesExist = false;
            for (RadarContact c : contacts) {
                if (contact.getContactID().equals(c.getContactID())) {
                    c.setBearing(contact.getBearing());
                    c.setDistance(contact.getDistance());
                    doesExist = true;
                    break;
                }
            }
            if (doesExist == false) {
                contacts.add(contact);
            }

        }
        return contact;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContact(java.lang.String)
     */
    public RadarContact getContact(String id) {
        for (RadarContact c : contacts) {
            if (id.equals(c.getContactID())) {
                return c;
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContactCount()
     */
    public int getContactCount() {
        return contacts.size();
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#removeContact(java.lang.String)
     */
    public RadarContact removeContact(String id) {
        for (RadarContact c : contacts) {
            if (id.equals(c.getContactID())) {
                contacts.remove(c);
                return c;
            }
        }

        return null;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts()
     */
    public List<RadarContact> returnContacts() {
        List<RadarContact> contactsCopy = new ArrayList<>();
        contactsCopy.addAll(contacts);
        return contactsCopy;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
     */
    public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
        List<RadarContact> contactsCopy = new ArrayList<>();
        contactsCopy.addAll(contacts);
        Collections.sort(contactsCopy, comparator);
        return contactsCopy;
    }

}
