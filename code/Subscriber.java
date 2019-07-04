Subscriber subscriber = SubscriberFactory.createSubscriber();
subscriber.subscribeServiceByName("Temperature");

subscriber.setSubscriberListener(new ISubscriberListener() {
    @Override
    public void onMessageArrived(Message message) {
        String name = message.getServiceName();
        long signal = message.getSignal(); 

        Log.d(TAG, "Service name: " + name + "\tRSSI: " + signal);
    }
});
