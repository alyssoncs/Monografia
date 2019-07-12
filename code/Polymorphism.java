Subscriber = SubscriberFactory.createSubscriber();
subscriber.addConnection(connection); //connection with mqtt broker
subscriber.subscribeObjectConnectedTopic();
subscriber.subscribeObjectDisconnectedTopic();

subscriber.setSubscriberListener(new ISubscriberListener() {
	@Override
	public void onMessageArrived(Message message) {
		if (message instanceof ObjectConnectedMessage) {
			/* do something */
		} else if (message instanceof ObjectDisconnectedMessage) {
			/* do somethinge else */
		}
	}
});
