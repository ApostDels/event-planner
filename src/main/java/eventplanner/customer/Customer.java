package eventplanner.customer;

import org.springframework.data.annotation.Id;

public class Customer {


    @Id
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String prefs;
    private Long eventIdsHosting;
    private Long eventIdsAttending;
    private Integer numOfEventsAttending;
    private Integer numOfEventsHosting;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrefs() {
        return prefs;
    }

    public void setPrefs(String prefs) {
        this.prefs = prefs;
    }

    public Long getEventIdsHosting() {
        return eventIdsHosting;
    }

    public void setEventIdsHosting(Long eventIdsHosting) {
        this.eventIdsHosting = eventIdsHosting;
    }

    public Long getEventIdsAttending() {
        return eventIdsAttending;
    }

    public void setEventIdsAttending(Long eventIdsAttending) {
        this.eventIdsAttending = eventIdsAttending;
    }

    public Integer getNumOfEventsAttending() {
        return numOfEventsAttending;
    }

    public void setNumOfEventsAttending(Integer numOfEventsAttending) {
        this.numOfEventsAttending = numOfEventsAttending;
    }

    public Integer getNumOfEventsHosting() {
        return numOfEventsHosting;
    }

    public void setNumOfEventsHosting(Integer numOfEventsHosting) {
        this.numOfEventsHosting = numOfEventsHosting;
    }

    public Customer(Long customerId,
                    String firstName,
                    String lastName,
                    String email,
                    String userName,
                    String prefs,
                    Long eventIdsHosting,
                    Long eventIdsAttending,
                    Integer numOfEventsAttending,
                    Integer numOfEventsHosting) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.prefs = prefs;
        this.eventIdsHosting = eventIdsHosting;
        this.eventIdsAttending = eventIdsAttending;
        this.numOfEventsAttending = numOfEventsAttending;
        this.numOfEventsHosting = numOfEventsHosting;
    }
}
