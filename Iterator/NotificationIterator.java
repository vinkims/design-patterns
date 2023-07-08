class NotificationIterator implements Iterator {
    
    Notification[] notificationList;

    // maintains current pos of iterator over the array
    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    public Object next() {
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext() {
        if (pos >= notificationList.length || notificationList[pos] == null) {
            return false;
        } else {
            return true;
        }
    }
}
